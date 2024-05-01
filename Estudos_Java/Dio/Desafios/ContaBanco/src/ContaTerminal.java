import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite qual é a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}
