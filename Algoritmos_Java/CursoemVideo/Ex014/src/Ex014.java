import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos Km foram percorridos com o carro: ");
        double kmPercorridos = scanner.nextDouble();

        System.out.print("Digite por quantos dias o carro foi alugado: ");
        int diasAlugados = scanner.nextInt();

        int pagarDias = diasAlugados * 90;
        double pagarKm = kmPercorridos * 0.20;
        double total = pagarDias + pagarKm;

        System.out.println("Sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.");
        System.out.println("Você deverá pagar R$" + pagarDias + " pelos dias alugados e R$" + pagarKm + " pelos km rodados.");
        System.out.println("Totalizando R$" + total + ".");
    }
}
