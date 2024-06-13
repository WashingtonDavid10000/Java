import java.util.Scanner;

public class Ex022{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade > 18){
            idade = idade - 18;
            System.out.println("Já se passaram " + idade + " anos desde do alistamento.");
        }
        else if(idade == 18){
            System.out.println("É ano de você se alistar!");
        }
        else{
            idade = 18 - idade;
            System.out.println("Ainda faltam " + idade + " anos para o alistamento.");
        }
    }
}