import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double produto = scanner.nextDouble();

        double desconto = produto*0.05;

        double preçoFinal = produto - desconto;

        System.out.println("O produto custa R$" + produto + ".");
        System.out.println("Com um desconto de 5%, ele custará " + preçoFinal);
    }
}
