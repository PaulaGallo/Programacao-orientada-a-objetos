public class recepcionista {
    private String cpf;
    private String nome;
    private String telefone;
    private String senha;

    public recepcionista() {
    }

    public recepcionista(String cpf, String nome, String telefone, String senha) throws Exception {
        setCpf(cpf);
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getSenha() {
        return "*********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new Exception("O CPF da recepcionista não pode estar vazio!");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("O nome da recepcionista não pode estar vazio!");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void acessar() {
    }

    public void mostrar() {
        System.out.println("\n---------------------------");
        System.out.println("| Objeto do recepcionista |");
        System.out.println("---------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("telefone: " + this.telefone);
    }
}