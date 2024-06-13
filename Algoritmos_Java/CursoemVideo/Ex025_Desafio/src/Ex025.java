import java.util.Scanner;

public class Ex025{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da 1º reta: ");
        int reta1 = scanner.nextInt();

        System.out.print("Digite o comprimento da 2º reta: ");
        int reta2 = scanner.nextInt();

        System.out.print("Digite o comprimento da 3º reta: ");
        int reta3 = scanner.nextInt();

        System.out.println("Para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.");

        if(reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2){
            System.out.println("Formam um triângulo.");
        }else{
            System.out.println("Não podem formar um triângulo.");
        }
    }
}