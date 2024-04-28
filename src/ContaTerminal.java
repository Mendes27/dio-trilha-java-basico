import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Conta Bancária**");

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Formatação e impressão dos dados da conta
        String dadosConta = formatarDadosConta(numeroConta, agencia, nomeCliente, saldo);
        System.out.println(dadosConta);
    }

    private static String formatarDadosConta(int numeroConta, String agencia, String nomeCliente, double saldo) {
        String dadosConta = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n";
        dadosConta += "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo inicial é de R$ " + saldo + ".";
        return dadosConta;
    }
}