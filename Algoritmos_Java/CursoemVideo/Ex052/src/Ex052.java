import java.util.Scanner;

public class Ex052{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int media = 0;
        int maior18 = 0;
        int menor5 = 0;
        int maior = 0;

        for(int c = 0; c < 10; c++){
            System.out.print("Digite a idade das pessoas do grupo: ");
            int idade = scan.nextInt();
            media = media + idade;
            if(idade > 18){
                maior18++;
            }
            if(idade < 5){
                menor5++;
            }
            if(idade > maior){
                maior = idade;
            }
        }
        System.out.println("Média de idade: " + (media/10));
        System.out.println("Maiores de 18 anos: " + maior18);
        System.out.println("Menores de 5 anos: " + menor5);
        System.out.println("Maior idade: " + maior);
    }
}