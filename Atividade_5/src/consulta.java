import java.util.ArrayList;
import java.util.List;

public class consulta {
    private String motivo;
    private String historico;

    private paciente paciente;
    private medico medico;

    private List<receita> receitas;
    private List<exame> exames;

    public consulta() {
        this.receitas = new ArrayList<>();
        this.exames = new ArrayList<>();
    }

    public consulta(String motivo, String historico, paciente paciente, medico medico) throws Exception {
        setMotivo(motivo);
        setHistorico(historico);
        this.paciente = paciente;
        this.medico = medico;
        this.receitas = new ArrayList<>();
        this.exames = new ArrayList<>();
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception {
        if (motivo == null || motivo.trim().isEmpty()) {
            throw new Exception("O motivo da consulta não pode estar vazio!");
        }
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public medico getMedico() {
        return medico;
    }

    public void setMedico(medico medico) {
        this.medico = medico;
    }

    public void adicionarReceita(String data, String descritivo) throws Exception {
        receita r = new receita(data, descritivo);
        this.receitas.add(r);
    }

    public void adicionarExame(String data, String descritivo) throws Exception {
        exame e = new exame(data, descritivo);
        this.exames.add(e);
    }

    public List<receita> getReceitas() {
        return receitas;
    }

    public List<exame> getExames() {
        return exames;
    }

    public void marcar() {
        System.out.println("Consulta marcada.");
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void consultar() {
        System.out.println("Consultando histórico da consulta.");
    }

    public void realizar() {
        System.out.println("Realizando consulta do paciente: " + (paciente != null ? paciente.getNome() : "Não informado"));
    }

    public void atualizar() {
        System.out.println("Consulta atualizada.");
    }

    public void mostrar() {
        System.out.println("\n----------------------");
        System.out.println("| Objeto da consulta |");
        System.out.println("----------------------");
        System.out.println("Motivo: " + this.motivo);
        System.out.println("Histórico: " + this.historico);
        System.out.println("Paciente: " + (paciente != null ? paciente.getNome() : "N/A"));
        System.out.println("Médico: " + (medico != null ? medico.getNome() : "N/A"));
        
        System.out.println("--- Receitas vinculadas ---");
        for (receita r : receitas) {
            System.out.println("- " + r.getDescritivo() + " (" + r.getData() + ")");
        }

        System.out.println("--- Exames vinculados ---");
        for (exame e : exames) {
            System.out.println("- " + e.getDescritivo() + " (" + e.getData() + ")");
        }
    }
}