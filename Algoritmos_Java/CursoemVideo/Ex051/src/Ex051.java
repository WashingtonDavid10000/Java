import java.util.Scanner;

public class Ex051{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double maior = 0;
        double menor = Double.MAX_VALUE;

        for(int c = 0; c < 8; c++){
            System.out.println("Digite um preço de um produto: ");
            double preco = scan.nextDouble();
            if(preco > maior){
                maior = preco;
            }
            if(preco < menor){
                menor = preco;
            }
        }

        System.out.println("Maior Preço: " + maior);
        System.out.println("Menor Preço: " + menor);
    }
}