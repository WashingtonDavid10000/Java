import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        for(int c = 0; c < 7; c++){
            System.out.print("Digite um número inteiro: ");
            int num = scan.nextInt();
            soma = soma + num;
        }
        System.out.println("A somatória entre todos os números digitados é: " + soma);
    }
}
