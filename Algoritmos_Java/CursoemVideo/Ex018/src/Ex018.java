import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos de idade.");

        if(idade > 18){
            System.out.println("Já pode votar.");
        }else{
            System.out.println("Não pode votar.");
        }
    }
}
