package gui;

import javax.swing.*;
import java.awt.*;
import app.Paciente;

public class PacienteForm extends JFrame {
    private final JTextField txtCodigo = new JTextField();
    private final JTextField txtNome = new JTextField();
    private final JTextField txtEmail = new JTextField();
    private final JTextField txtTelefone = new JTextField();
    private final JTextField txtDocumento = new JTextField();
    private final JTextField txtConvenio = new JTextField();
    private final JTextField txtPesquisa = new JTextField();

    public PacienteForm() {
        setTitle("Cadastro de Pacientes");
        setSize(1000, 600);
        setMinimumSize(new Dimension(800, 450));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        montarTela();
    }

    private void montarTela() {
        JPanel principal = new JPanel(new BorderLayout(10, 10));
        principal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titulo = new JLabel("Cadastro de Pacientes");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        principal.add(titulo, BorderLayout.NORTH);

        JPanel centro = new JPanel(new BorderLayout(10, 10));
        centro.add(criarFormulario(), BorderLayout.NORTH);
        
        principal.add(centro, BorderLayout.CENTER);
        setContentPane(principal);
    }

    private JPanel criarFormulario() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Dados do Paciente"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        adicionarCampo(painel, gbc, 0, 0, "Código:", txtCodigo);
        adicionarCampo(painel, gbc, 1, 0, "Nome:", txtNome);
        adicionarCampo(painel, gbc, 0, 1, "E-mail:", txtEmail);
        adicionarCampo(painel, gbc, 1, 1, "Telefone:", txtTelefone);
        adicionarCampo(painel, gbc, 0, 2, "Documento:", txtDocumento);
        adicionarCampo(painel, gbc, 1, 2, "Convênio:", txtConvenio);

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnNovo = new JButton("Novo");
        JButton btnSalvar = new JButton("Salvar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnLimpar = new JButton("Limpar");

        botoes.add(btnNovo);
        botoes.add(btnSalvar);
        botoes.add(btnExcluir);
        botoes.add(btnLimpar);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        painel.add(botoes, gbc);

        btnNovo.addActionListener(e -> limparFormulario());
        btnSalvar.addActionListener(e -> salvar());
        btnExcluir.addActionListener(e -> excluir());
        btnLimpar.addActionListener(e -> limparFormulario());
        return painel;
    }

    private Object excluir() {
        return null;
    }

private void salvar() {
        dao.PacienteDAO.criarTabela();

        var obj = new app.Paciente();
        obj.setNome(txtNome.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setDocumento(txtDocumento.getText());
        obj.setConvenio(txtConvenio.getText());

        dao.PacienteDAO.inserir(obj);
  
        JOptionPane.showMessageDialog(this, "Paciente registrado com sucesso no banco de dados!");
        limparFormulario();
    }

    private Object limparFormulario() {
        txtCodigo.setText("");
        txtDocumento.setText("");
        txtEmail.setText("");
        txtConvenio.setText("");
        txtNome.setText("");
        txtPesquisa.setText("");
        txtTelefone.setText("");
        return null;
    }

    private void adicionarCampo(JPanel painel, GridBagConstraints gbc, int coluna, int linha, String rotulo, JTextField campo) {
        gbc.gridx = coluna * 2;
        gbc.gridy = linha;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        painel.add(new JLabel(rotulo), gbc);

        gbc.gridx = coluna * 2 + 1;
        gbc.weightx = 1;
        painel.add(campo, gbc);
    }
}