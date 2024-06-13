import java.util.Random;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int numeroSorteado = rand.nextInt(11) + 1;
        int c = 0;

        for(c = 0; c < 4; c++){
            System.out.print("Advinhe o número: ");
            int tentativa = scan.nextInt();
            if(tentativa == numeroSorteado){
                System.out.println("Parabéns, o número sorteado era: " + numeroSorteado);
                break;
            }else{
                System.out.println("Tente novamente!");
            }
        }
        if(c == 4){
            System.out.println("O número sorteado era: " + numeroSorteado);
        }
    }
}
