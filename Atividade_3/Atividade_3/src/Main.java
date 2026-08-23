/*1-Quais as principais caracteristicas do java que são vantagens em detrimento de outra tecnologias

Java tem como principais vantagens a portabilidade, pois o mesmo código pode funcionar em diferentes sistemas operacionais; a versatilidade, podendo ser usado em diversos tipos de aplicações; e o gerenciamento automático de memória, realizado pelo Garbage Collector. Além disso, possui uma grande quantidade de bibliotecas e APIs.

2-O que e JVM e qual a sua correlação com o bytecode

A JVM (Java Virtual Machine) é responsável por executar programas Java. Quando o código é compilado, ele gera bytecode, que é um código intermediário. A JVM interpreta esse bytecode, permitindo que o mesmo programa seja executado em diferentes sistemas operacionais, desde que possuam uma JVM compatível. */

public class Main {
    public static void main(String[] args) {

        var maria = new paciente();

        maria.setNome("Maria");
        maria.setCodigo(1);
        maria.setEmail("maria@norton.br");
        maria.setIdade(30);
        maria.setTelefone("1111-1111");
        maria.setGenero("F");
        maria.mostrar();


        var Giovana = new medico();

        Giovana.setNome("Giovana");
        Giovana.setCrm("2222222222");
        Giovana.setTelefone("2222-2222");
        Giovana.setEspecialidade("Ginecologista");
        Giovana.mostrar();
        System.out.println("senha da Giovana: " + Giovana.getSenha());


        var Lucas = new recepcionista();

        Lucas.setNome("Lucas");
        Lucas.setCpf("333.333.333-33");
        Lucas.setTelefone("3333-3333");
        Lucas.mostrar();
        System.out.println("senha do Lucas: " + Lucas.getSenha());


        var agendamento = new agenda();

        agendamento.setData("30/09/2026");
        agendamento.setHora("17:00");
        agendamento.setMedico("Giovana");
        agendamento.setPaciente("Maria");
        agendamento.mostrar();


        var consulta42 = new consulta();

        consulta42.setData("30/09/2026");
        consulta42.setHora("17:00");
        consulta42.setMedico("Giovana");
        consulta42.setPaciente("Maria");
        consulta42.setMotivo("Colicas");
        consulta42.setHistorico("Sem historico");
        consulta42.mostrar();


        var receita42 = new receita();

        receita42.setData("30/09/2026");
        receita42.setConsulta("42");
        receita42.setDescritivo("Anti Concepcional");
        receita42.mostrar();


        var exame42 = new exame();

        exame42.setData("30/09/2026");
        exame42.setConsulta("42");
        exame42.setDescritivo("Hemograma Completo");
        exame42.mostrar();
    }
}