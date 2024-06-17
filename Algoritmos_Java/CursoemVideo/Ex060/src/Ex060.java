import java.util.Scanner;

public class Ex060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        String sexo;
        int maisVelho = 0;
        String nomeMaisVelho = "";
        int mulherMaisJovem = Integer.MAX_VALUE;
        String nomeMulherMaisJovem = "";
        int mediaIdade = 0;
        int qtPessoas = 0;
        int homensMaiorTrinta = 0;
        int mulherMenosDezoito = 0;
        String flag = "continuar";

        while(flag != "parar"){
            System.out.println("Digite o nome: ");
            nome = scan.next();

            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            mediaIdade = mediaIdade + idade;

            System.out.println("Digite o sexo[h/m]: ");
            sexo = scan.next();
            qtPessoas++;
            
            if(idade > maisVelho){
                maisVelho = idade;
                nomeMaisVelho = nome;
            }

            if(sexo.equals("m")){
                if(idade < mulherMaisJovem){
                    nomeMulherMaisJovem = nome;
                }
                if(idade < 18){
                    mulherMenosDezoito++;
                }
            }else if(sexo.equals("h")){
                if(idade > 30){
                    homensMaiorTrinta++;
                }
            }

            System.out.println("Deseja continuar[s/n]: ");
            String cont = scan.next();
            if(cont.equals("s")){
                flag = "continuar";
            }else if(cont.equals("n")){
                flag = "parar";
            }
        }
        System.out.println("Nome da pessoa mais velha: " + nomeMaisVelho);
        System.out.println("Mulher mais jovem: " + nomeMulherMaisJovem);
        System.out.println("Média das idades digitadas: " + (mediaIdade/qtPessoas));
        System.out.println("Quantidade de homens acima dos 30: " + homensMaiorTrinta);
        System.out.println("Quantidade de mulheres abaixo dos 18: " + mulherMenosDezoito);

    }
}
