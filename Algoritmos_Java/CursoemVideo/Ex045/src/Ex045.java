import java.util.Scanner;

public class Ex045 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int inicio = scan.nextInt();
        
        System.out.print("Digite o último valor: ");
        int fim = scan.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scan.nextInt();

        if(inicio > fim){
            for(int c = fim; c <= inicio; c = c + incremento){
                System.out.print(c + " ");
            }
    
            System.out.println("Acabou!");
        }else{
            for(int c = inicio; c <= fim; c = c + incremento){
                System.out.print(c + " ");
            }
    
            System.out.println("Acabou!");
        }

        
    }
}
