import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Km você deseja percorrer?: ");
        int km = scanner.nextInt();

        if(km <= 200){
            double valorPassagem = km * 0.50;
            System.out.println("Para cada km rodado você pagará R$0,50.");
            System.out.println("Total a ser pago: R$" + valorPassagem);
        }else if(km > 200){
            double valorPassagem = km * 0.45;
            System.out.println("Para cada km rodado você pagará R$0,45 pois ultrapassa os 200km.");
            System.out.println("Total a ser pago: R$" + valorPassagem);
        }

    }
}
