import java.util.Scanner;

public class Ex026{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior!");
        }else if(num2 > num1){
            System.out.println("O segundo número é maior!");
        }else{
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
}