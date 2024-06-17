import java.util.Scanner;

public class Ex058{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idadeAlunos = 0;
        int quantAlunos = 0;
        int media = 0;
        String flag = "continuar";
        
        while(flag != "parar"){
            System.out.println("Digite a idade do aluno: ");
            idadeAlunos = scan.nextInt();
            if(idadeAlunos == 999){
                System.out.println("O número 999 foi digitado. Programa encerrado.");
                break;
            }
            quantAlunos = quantAlunos + 1;
            media = media + idadeAlunos;
            if(quantAlunos % 4 == 0){
                System.out.println("Deseja continuar?[s/n]: ");
                String cont = scan.next();
                if(cont.equals("n")){
                    flag = "parar";
                }else if(cont.equals("s")){
                    flag = "continuar";
                }
            }
        }
        System.out.println("Quantidade de alunos registrado: " + quantAlunos);
        System.out.println("Média entre as idades digitadas: " + (media/quantAlunos));
    }
}