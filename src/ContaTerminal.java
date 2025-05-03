import java.util.Scanner;

public class ContaTerminal {

    public Conta receberDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;
        
        while (true) {
            System.out.print("Digite o saldo inicial: ");
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Insira um valor válido de dinheiro.");
            }
        }
        
        scanner.close();        

        return new Conta(numeroConta, numeroAgencia, nomeCliente, saldo);
    }

    public class Conta {

        private String numeroConta;
        private String numeroAgencia;
        private String nomeCliente;
        private Double saldo;

        public Conta(String numeroConta, String numeroAgencia, String nomeCliente, Double saldo) {
            this.numeroConta = numeroConta;
            this.numeroAgencia = numeroAgencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }

        public void imprimirDados() {
            System.out.printf("Cliente: %s\n", nomeCliente);
            System.out.printf("Agência: %s\n", numeroAgencia);
            System.out.printf("Conta: %s\n", numeroConta);
            System.out.printf("Saldo: %.2f\n", saldo);
        }

    }

    public static void main(String[] args) throws Exception {
        
        ContaTerminal contaTerminal = new ContaTerminal();
        Conta conta = contaTerminal.receberDados();
        conta.imprimirDados();

    }
}
