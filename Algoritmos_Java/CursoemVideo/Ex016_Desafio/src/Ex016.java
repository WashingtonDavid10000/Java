import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos cigarros fuma por dia?: ");
        int cigarrosPorDia = scanner.nextInt();
       

        System.out.print("Há quantos anos fuma?: ");
        int anosFumados = scanner.nextInt();
        int totalDias = anosFumados * 365;

        int totalTempo = (cigarrosPorDia * totalDias) * 10;

        System.out.println("Considerando que a cada cigarro, são 10 minutos vida perdidos...");
        System.out.println(totalTempo + " minutos de vida foram perdidos...");



    }
}
