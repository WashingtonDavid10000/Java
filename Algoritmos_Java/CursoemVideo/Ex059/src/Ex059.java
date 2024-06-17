import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sexo;
        int idade;
        int maiorIdade = 0;
        int qtHomens = 0;
        int mulherMaisNova = Integer.MAX_VALUE;
        int mediaIdadeHomens = 0;
        int qtPessoas = 0;
        String flag = "continuar";


        while(flag != "parar"){
            System.out.println("Digite o sexo da pessoa[h/m]: ");
            sexo = scan.next();

            System.out.println("Digite a idade da pessoa: ");
            idade = scan.nextInt();
            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            if(sexo.equals("h")){
                qtHomens = qtHomens + 1;
                mediaIdadeHomens = mediaIdadeHomens + idade;
            }else if(sexo.equals("m")){
                if(idade < mulherMaisNova){
                    mulherMaisNova = idade;
                }
            }

            qtPessoas = qtPessoas + 1;
            if(qtPessoas%4==0){
                System.out.println("Deseja Continuar?[s/n]: ");
                String cont = scan.next();
                if(cont.equals("s")){
                    flag = "continuar";
                }else if(cont.equals("n")){
                    flag = "parar";
                }   
            }
        }

        System.out.println("Maior idade digitada: " + maiorIdade);
        System.out.println("Quantidade de homens registrados: " + qtHomens);
        System.out.println("Mulher mais nova: " + mulherMaisNova);
        System.out.println("Media de idade entre homens: " + (mediaIdadeHomens/qtHomens));
    }
}
