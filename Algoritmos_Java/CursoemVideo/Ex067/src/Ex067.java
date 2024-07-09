import java.util.Scanner;

public class Ex067{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        for(int c = 0; c <= num; c++){
            System.out.print(c + ", ");
        }
        System.out.println("FIM!");

    }
}