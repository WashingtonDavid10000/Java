import java.util.Scanner;

public class Ex023{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o seu sexo[h/m]: ");
        String sexo = scanner.next();

        System.out.print("Digite o valor das compras: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Sabendo que homens recebem 5% de desconto e mulheres recebem 13%...");
       

        if(sexo.equals("h")){
            double desconto = valorCompra * 0.05;
            valorCompra = valorCompra - desconto;
            System.out.println(nome + " recebeu um desconto de 5% em suas compras, e pagará um total de R$" + valorCompra);
        }else if(sexo.equals("m")){
            double desconto = valorCompra * 0.13;
            valorCompra = valorCompra - desconto;
            System.out.println(nome + " recebeu um desconto de 13% em suas compras, e pagará um total de R$" + valorCompra);
        }
    }
}