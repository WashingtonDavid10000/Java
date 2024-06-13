import java.util.Scanner;

public class Ex002{

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }

}