public class recepcionista extends funcionario {
    private String cpf;

    public recepcionista() {
    }

    public recepcionista(String nome, String telefone, String senha, String cpf) throws Exception {
        super(nome, telefone, senha);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new Exception("CPF da recepcionista não pode estar vazio!");
        }
        this.cpf = cpf;
    }

    public void cadastra(paciente p) {
        System.out.println("Recepcionista " + getNome() + " cadastrou o paciente " + p.getNome());
    }

    public void marcar(consulta c) {
        System.out.println("Recepcionista " + getNome() + " marcou a consulta.");
    }

    public void mostrar() {
        System.out.println("\n---------------------------");
        System.out.println("| Objeto do recepcionista |");
        System.out.println("---------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + getTelefone());
    }
}