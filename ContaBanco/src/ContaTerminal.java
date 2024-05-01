import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Por favor, digite o Nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo:");
            double saldo = scanner.nextDouble();

            ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

            System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                    conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
