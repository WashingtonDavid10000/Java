import java.util.Scanner;

public class Ex053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int homem = 0;
        int mulher = 0;
        int mediaGeral = 0;
        int mediaHomem = 0;
        int mulheres20 = 0; 


        for(int c = 0; c < 5; c++){
            System.out.print("Digite a idade da pessoa: ");
            int idade = scan.nextInt();

            System.out.print("Digite o sexo da pessoa[h/m]: ");
            String sexo = scan.next();

            mediaGeral = mediaGeral + idade;

            if(sexo.equals("h")){
                homem++;
                mediaHomem = mediaHomem + idade;
            }
            if(sexo.equals("m")){
                mulher++;
                if(idade > 20){
                    mulheres20++;
                }
            }
            
        }

        System.out.println("Homens cadastrados: " + homem);
        System.out.println("Mulheres cadastradas: " + mulher);
        System.out.println("Media de idade geral: " + (mediaGeral/5));
        System.out.println("Media de idade masculina: " + (mediaHomem/homem));
        System.out.println("Mulheres acima dos 20 anos: " + mulheres20);
    }
}
