// PessoaFisica.java
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
