import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        double dobro = num * 2;
        double terçaParte = num / 3;

        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + terçaParte);

    }
}
