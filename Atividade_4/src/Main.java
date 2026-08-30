public class Main {
    public static void main(String[] args) {

        try {
            var maria = new paciente();
            maria.setCodigo(1);
            maria.setNome("Maria");
            maria.setEmail("maria@norton.br");
            maria.setTelefone("1111-1111");
            maria.setIdade(30);
            maria.setGenero("F");
            maria.mostrar();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        }

        try {
            var giovana = new medico("2222222222", "Giovana", "2222-2222", "Ginecologista", "senha123");
            giovana.mostrar();
            System.out.println("senha da Giovana: " + giovana.getSenha());
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar médico: " + e.getMessage());
        }

        try {
            var lucas = new recepcionista();
            lucas.setCpf("333.333.333-33");
            lucas.setNome("Lucas");
            lucas.setTelefone("3333-3333");
            lucas.setSenha("12345");
            lucas.mostrar();
            System.out.println("senha do Lucas: " + lucas.getSenha());
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar recepcionista: " + e.getMessage());
        }

        try {
            var agendamento = new agenda();
            agendamento.setData("");
            agendamento.setHora("17:00");
            agendamento.setMedico("Giovana");
            agendamento.setPaciente("Maria");
            agendamento.mostrar();
        } catch (Exception e) {
            System.out.println("Erro na agenda: " + e.getMessage());
        }

        try {
            var consulta42 = new consulta();
            consulta42.setData("30/09/2026");
            consulta42.setHora("17:00");
            consulta42.setMedico("Giovana");
            consulta42.setPaciente("Maria");
            consulta42.setMotivo("Colicas");
            consulta42.setHistorico("Sem historico");
            consulta42.mostrar();
        } catch (Exception e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        }

        try {
            var receita42 = new receita();
            receita42.setData("30/09/2026");
            receita42.setConsulta("42");
            receita42.setDescritivo("Anti Concepcional");
            receita42.mostrar();
        } catch (Exception e) {
            System.out.println("Erro na receita: " + e.getMessage());
        }

        try {
            var exame42 = new exame();
            exame42.setData("30/09/2026");
            exame42.setConsulta("42");
            exame42.setDescritivo("Hemograma Completo");
            exame42.mostrar();
        } catch (Exception e) {
            System.out.println("Erro no exame: " + e.getMessage());
        }
    }
}