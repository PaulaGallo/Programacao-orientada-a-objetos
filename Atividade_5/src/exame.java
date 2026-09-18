public class exame extends procedimento {

    public exame() {
    }

    public exame(String data, String descritivo) throws Exception {
        super(data, descritivo);
    }

    public void solicitar() {
        System.out.println("Exame solicitado na data " + getData());
    }

    public void mostrar() {
        System.out.println("\n--------------------");
        System.out.println("| Objeto do exame  |");
        System.out.println("--------------------");
        System.out.println("Data: " + getData());
        System.out.println("Descritivo: " + getDescritivo());
    }
}