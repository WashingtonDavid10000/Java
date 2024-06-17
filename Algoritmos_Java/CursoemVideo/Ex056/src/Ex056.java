import java.util.Scanner;

public class Ex056{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int soma = 0;
        String flag = "continuar";

        while(flag != "parar"){
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma = soma + num;
            System.out.println("soma de todos os números: " + soma);
            if(num == 1111){
                System.out.println("O número 1111 foi digitado. Programa Encerrado.");
                flag = "parar";
            }
        }
        
    }
}