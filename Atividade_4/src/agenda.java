public class agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    
    public agenda() {
    }

    public agenda(String data, String hora, String medico, String paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null || data.trim().isEmpty()) {
            throw new Exception("A data da agenda não pode estar vazia!");
        }
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) throws Exception {
        if (medico == null || medico.trim().length() < 3) {
            throw new Exception("O nome do médico deve ter pelo menos 3 caracteres!");
        }
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void consultar() {
    }

    public void mostrar() {
        System.out.println("\n--------------------");
        System.out.println("| Objeto da agenda |");
        System.out.println("--------------------");
        System.out.println("data: " + this.data);
        System.out.println("hora: " + this.hora);
        System.out.println("medico: " + this.medico);
        System.out.println("paciente: " + this.paciente);
    }
}