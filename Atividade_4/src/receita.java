public class receita {
    private String data;
    private String consulta;
    private String descritivo;

    public receita() {
    }

    public receita(String data, String consulta, String descritivo) throws Exception {
        setData(data);
        setConsulta(consulta);
        setDescritivo(descritivo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null || data.trim().isEmpty()) {
            throw new Exception("A data da receita não pode estar vazia!");
        }
        this.data = data;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo == null || descritivo.trim().isEmpty()) {
            throw new Exception("O descritivo dos medicamentos não pode estar vazio!");
        }
        this.descritivo = descritivo;
    }

    public void prescrever() {
    }

    public void consultar() {
    }

    public void mostrar() {
        System.out.println("\n----------------------");
        System.out.println("| Objeto da receita |");
        System.out.println("----------------------");
        System.out.println("data: " + this.data);
        System.out.println("consulta: " + this.consulta);
        System.out.println("descritivo: " + this.descritivo);
    }
}