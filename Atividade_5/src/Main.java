public class Main {
    public static void main(String[] args) {

        try {
            paciente maria = new paciente("Maria Silva", "111.222.333-44", "1111-1111", "Feminino", 30);
            maria.mostrar();

            medico giovana = new medico("Giovana Rocha", "2222-2222", "senha123", "2222222222", "Ginecologista");
            giovana.mostrar();

            recepcionista lucas = new recepcionista("Lucas Santos", "3333-3333", "12345", "333.333.333-33");
            lucas.mostrar();

            lucas.cadastra(maria);

            agenda agendamento = new agenda("30/09/2026", "17:00", "Cólicas", "Sem histórico", maria, giovana);
            lucas.marcar(agendamento);
            agendamento.mostrar();

            consulta consulta42 = new consulta("Cólicas intensas", "Histórico recente de dores", maria, giovana);
            
            consulta42.adicionarReceita("30/09/2026", "Anti-inflamatório 500mg");
            consulta42.adicionarExame("30/09/2026", "Ultrassom Pélvica");

            consulta42.realizar();
            consulta42.mostrar();

        } catch (Exception e) {
            System.out.println("Erro na execução: " + e.getMessage());
        }
    }
}