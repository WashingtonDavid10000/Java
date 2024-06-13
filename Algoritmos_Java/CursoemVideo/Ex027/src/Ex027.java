import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a primeira nota de " + nome + ": ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota de " + nome + ": ");
        double nota2 = scanner.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println("Sua média é de: " + media);

        if(media >= 7){
            System.out.println("Aprovado!");
        }else if(media >= 5 && media < 7){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
