import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto de dinheiro você tem na sua carteira?: ");
        double dinheiro = scanner.nextDouble();

        System.out.println("Considerando US$1,00 = R$3,45.");
        System.out.println("Você poderia comprar US$" + dinheiro/3.45 + ".");
    }
}
