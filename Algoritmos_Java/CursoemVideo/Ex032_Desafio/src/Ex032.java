import java.util.Scanner;
import java.util.Random;

public class Ex032{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(1,5);
        System.out.print("Adivinhe o número de 1 a 5: "); 
        int num = scanner.nextInt();

        if(num == numeroAleatorio){
            System.out.println("VOCÊ ACERTOU! O NÚMERO ERA: " + numeroAleatorio);
        }else{
            System.out.println("Você errou, tente novamente.");
        }
    }
}