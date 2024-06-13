import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.print("Digite o salário de " + nome + ": ");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.15;

        double salarioFinal = salario + aumento;

        System.out.println("Com um aumento de 15%, o salário de " + nome + " será de " + salarioFinal);
    }
}
