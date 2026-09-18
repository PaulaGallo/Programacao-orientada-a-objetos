public class procedimento {
    private String data;
    private String descritivo;

    public procedimento() {
    }

    public procedimento(String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null || data.trim().isEmpty()) {
            throw new Exception("Data não pode estar vazia!");
        }
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo == null || descritivo.trim().isEmpty()) {
            throw new Exception("Descritivo não pode estar vazio!");
        }
        this.descritivo = descritivo;
    }

    public void consultar() {
        System.out.println("Consultando procedimento: " + descritivo);
    }
}