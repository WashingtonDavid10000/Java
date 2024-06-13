import java.util.Scanner;
import java.util.Random;

public class Ex031 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int aleatorio = rand.nextInt(1,3);
        System.out.println("PEDRA == 1");
        System.out.println("PAPEL == 2");
        System.out.println("TESOURA == 3");
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();

        if(aleatorio==1){
            System.out.println("O computador escolheu: PEDRA!");
        }else if (aleatorio==2) {
            System.out.println("O computador escolheu: PAPEL!");
        }else{
            System.out.println("O computador escolheu: TESOURA!");
        }

        if(escolha==1){
            System.out.println("Você escolheu: PEDRA!");
        }else if (escolha==2) {
            System.out.println("Você escolheu: PAPEL!");
        }else{
            System.out.println("Você escolheu: TESOURA!");
        }

        if(escolha==1 && aleatorio==2){
            System.out.println("Você Perdeu!");
        }else if(escolha==2 && aleatorio==3){
            System.out.println("Você Perdeu!");
        }else if(escolha==3 && aleatorio==1){
            System.out.println("Você Perdeu!");
        }else if(escolha==aleatorio){
            System.out.println("Empate!");
        }else{
            System.out.println("Você Venceu!");
        }

    }
}
