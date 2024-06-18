import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        String cont;
        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        int qtNum = 0;
        int media = 0;
        int valoresPares = 0;

        do{
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma+=num;
            qtNum++;
            media+=num;
            if(num < menorValor){
                menorValor = num;
            }
            if(num % 2 == 0){
                valoresPares++;
            }


            System.out.println("Deseja continuar? [s/n]");
            cont = scan.next();
        }while(cont.equals("s"));
        
        System.out.println("A soma entre os números: " + soma);
        System.out.println("Menor valor digitado: " + menorValor);
        System.out.println("Média entre os números: " + (media/qtNum));
        System.out.println("Valores pares: " + valoresPares);
    }
}
