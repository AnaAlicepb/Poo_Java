// Main.java
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Ana", "Rua A, 123", "1234-5678", "123.456.789-00", "01/01/1980");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Rua B, 456", "8765-4321", "12.345.678/0001-99", "Empresa X Ltda");

        System.out.println("Dados da Pessoa Física:");
        pf.mostrarDados();

        System.out.println("\nDados da Pessoa Jurídica:");
        pj.mostrarDados();
    }
}
