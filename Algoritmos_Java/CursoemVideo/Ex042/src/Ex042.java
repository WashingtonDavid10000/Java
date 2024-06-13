import java.util.Scanner;

public class Ex042{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = scan.nextInt();

        for(int c = 0; c <= num; c++){
            System.out.print(c + " ");
        }
        System.out.print("Acabou!");
    }
}