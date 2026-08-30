public class consulta {
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    private String motivo;
    private String historico;

    public consulta() {
    }

    public consulta(String data, String hora, String medico, String paciente, String motivo, String historico) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null || data.trim().isEmpty()) {
            throw new Exception("A data da consulta não pode estar vazia!");
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

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception {
        if (motivo == null || motivo.trim().isEmpty()) {
            throw new Exception("O motivo da consulta não pode estar vazio!");
        }
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void marcar() {
    }

    public void cancelar() {
    }

    public void consultar() {
    }

    public void atualizar() {
    }

    public void realizar() {
    }

    public void mostrar() {
        System.out.println("\n----------------------");
        System.out.println("| Objeto da consulta |");
        System.out.println("----------------------");
        System.out.println("data: " + this.data);
        System.out.println("hora: " + this.hora);
        System.out.println("medico: " + this.medico);
        System.out.println("paciente: " + this.paciente);
        System.out.println("motivo: " + this.motivo);
        System.out.println("historico: " + this.historico);
    }
}