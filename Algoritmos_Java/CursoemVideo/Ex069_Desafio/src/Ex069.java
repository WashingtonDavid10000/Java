import java.util.Scanner;

public class Ex069{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite o primeiro termo da P.A: ");
        int termo1 = scan.nextInt();

        System.out.println("Digite a razão da P.A: ");
        int razao = scan.nextInt();

        soma = 10*((termo1*2) + (10-1)*razao)/2;
        System.out.println("Soma dos 10 primeiros termos da P.A: " + soma);

        System.out.println("10 primeiros termos da P.A: ");
        for(int c = 1; c <= 10; c++){
            System.out.print(termo1 + " ");
            termo1 += razao;
        }

    }
}