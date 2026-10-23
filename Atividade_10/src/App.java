import javax.swing.SwingUtilities;
import gui.PacienteForm;
import gui.MedicoForm;
import gui.RecepcionistaForm;

public class App {
    public static void main(String[] args) throws Exception {
         SwingUtilities.invokeLater(() -> {
            // Você pode alterar para MedicoForm() ou RecepcionistaForm() para testar as outras telas
            var janela = new PacienteForm();
            janela.setVisible(true);
         });
    }
}