import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a primeira nota de " + nome + ": ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota de " + nome + ": ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println(nome + " teve um bom aproveitamento, com uma média de " + media);
        }else{
            System.out.println(nome + " teve um aproveitamento ruim, com uma média de " + media);
        }
    }
}