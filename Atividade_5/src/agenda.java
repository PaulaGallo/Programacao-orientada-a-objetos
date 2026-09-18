public class agenda extends consulta {
    private String data;
    private String hora;

    public agenda() {
        super();
    }

    public agenda(String data, String hora, String motivo, String historico, paciente paciente, medico medico) throws Exception {
        super(motivo, historico, paciente, medico);
        setData(data);
        setHora(hora);
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

    @Override
    public void consultar() {
        System.out.println("Consultando agendamento para a data " + data + " às " + hora);
    }

    @Override
    public void mostrar() {
        System.out.println("\n--------------------");
        System.out.println("| Objeto da agenda |");
        System.out.println("--------------------");
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Paciente: " + (getPaciente() != null ? getPaciente().getNome() : "N/A"));
        System.out.println("Médico: " + (getMedico() != null ? getMedico().getNome() : "N/A"));
    }
}