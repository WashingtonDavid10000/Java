import java.util.Scanner;

public class Ex049{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;


        for(int c = 0; c < 6; c++){
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            if(num % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }
        }
        System.out.println(par + " números são pares.");
        System.out.println(impar + " números são ímpares.");
    }
}