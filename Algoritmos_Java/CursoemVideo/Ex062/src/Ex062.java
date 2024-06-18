import java.util.Scanner;

public class Ex062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        String cont;
        int qtIdade = 0;
        int mediaIdade = 0;
        int idade21ouMais = 0;

        do{
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            qtIdade++;
            mediaIdade = mediaIdade + idade;
            if(idade >= 21){
                idade21ouMais++;
            }

            System.out.println("Deseja continuar? [s/n]");
            cont = scan.next();
        }while(cont.equals("s"));

        System.out.println("Pessoas registradas: " + qtIdade);
        System.out.println("Média das idades: " + (mediaIdade/qtIdade));
        System.out.println("Pessoas acima dos 21 anos: " + idade21ouMais);
    }
}
