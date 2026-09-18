public class paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public paciente() {
    }

    public paciente(String nome, String cpf, String telefone, String genero, int idade) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Nome do paciente não pode estar vazio!");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new Exception("CPF do paciente não pode estar vazio!");
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrar() {
        System.out.println("Paciente " + nome + " cadastrado.");
    }

    public void consultar() {
        System.out.println("Consultando dados do paciente " + nome);
    }

    public void mostrar() {
        System.out.println("\n----------------------");
        System.out.println("| Objeto do paciente |");
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Idade: " + this.idade);
    }
}