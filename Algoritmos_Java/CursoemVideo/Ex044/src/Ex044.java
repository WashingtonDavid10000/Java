import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int inicio = scan.nextInt();
        
        System.out.print("Digite o último valor: ");
        int fim = scan.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scan.nextInt();

        for(int c = inicio; c <= fim; c = c + incremento){
            System.out.print(c + " ");
        }

        System.out.println("Acabou!");
    }
}
