public class funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public funcionario() {
    }

    public funcionario(String nome, String telefone, String senha) throws Exception {
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "*********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {
        System.out.println(nome + " acessou o sistema.");
    }
}