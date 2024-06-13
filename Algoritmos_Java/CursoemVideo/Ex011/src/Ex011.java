import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        double delta = (B*B) - (4*A*C);
        
        System.out.println(A + "x² + " + B + "x + " + C + " = 0");
        System.out.println(B + "² - 4 * " + A + " * " + C);
        System.out.println("O valor de delta será: " + delta);
    }
}
