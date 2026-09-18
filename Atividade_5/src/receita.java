public class receita extends procedimento {

    public receita() {
    }

    public receita(String data, String descritivo) throws Exception {
        super(data, descritivo);
    }

    public void prescrever() {
        System.out.println("Receita emitida na data " + getData());
    }

    public void mostrar() {
        System.out.println("\n----------------------");
        System.out.println("| Objeto da receita  |");
        System.out.println("----------------------");
        System.out.println("Data: " + getData());
        System.out.println("Descritivo: " + getDescritivo());
    }
}