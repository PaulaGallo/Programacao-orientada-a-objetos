public class medico extends funcionario {
    private String crm;
    private String especialidade;

    public medico() {
    }

    // Construtor com a ordem correta dos parametros: (nome, telefone, senha, crm, especialidade)
    public medico(String nome, String telefone, String senha, String crm, String especialidade) throws Exception {
        super(nome, telefone, senha);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm == null || crm.trim().isEmpty()) {
            throw new Exception("CRM não pode estar vazio!");
        }
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public receita prescrever(String data, String descritivo) throws Exception {
        System.out.println("Dr(a). " + getNome() + " prescreveu uma receita.");
        return new receita(data, descritivo);
    }

    public exame solicitar(String data, String descritivo) throws Exception {
        System.out.println("Dr(a). " + getNome() + " solicitou um exame.");
        return new exame(data, descritivo);
    }

    public void mostrar() {
        System.out.println("\n--------------------");
        System.out.println("| Objeto do medico |");
        System.out.println("--------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CRM: " + this.crm);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Telefone: " + getTelefone());
    }
}