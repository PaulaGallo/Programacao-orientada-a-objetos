public class medico {
    private String crm;
    private String nome;
    private String telefone;
    private String especialidade;
    private String senha;

    public medico() {
    }

    public medico(String crm, String nome, String telefone, String especialidade, String senha) throws Exception {
        setCrm(crm);
        setNome(nome);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getSenha() {
        return "*********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm == null || crm.trim().isEmpty()) {
            throw new Exception("CRM do médico não pode estar vazio!");
        }
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Nome do médico não pode estar vazio!");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void acessar() {
    }

    public void mostrar() {
        System.out.println("\n--------------------");
        System.out.println("| Objeto do medico |");
        System.out.println("--------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("crm: " + this.crm);
        System.out.println("telefone: " + this.telefone);
        System.out.println("especialidade: " + this.especialidade);
    }
}