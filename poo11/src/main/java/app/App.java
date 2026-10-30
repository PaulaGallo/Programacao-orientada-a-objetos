import javax.swing.SwingUtilities;
import gui.MedicoForm; // ou PacienteForm / RecepcionistaForm

public class App {
    public static void main(String[] args) throws Exception {
         SwingUtilities.invokeLater(() -> {
            var janela = new MedicoForm();
            janela.setVisible(true);
         });
    }
}