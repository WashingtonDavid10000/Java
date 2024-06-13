import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salarioAtual = scan.nextDouble();

        System.out.println("Digite o gênero[h/m]: ");
        String genero = scan.next();

        System.out.println("Há quantos anos trabalha na empresa: ");
        int anosTrabalhados = scan.nextInt();

        double aumento = 0;

        if(genero.equals("h") && anosTrabalhados <= 20){
            aumento = salarioAtual*0.03;
        }else if(genero.equals("h") && (anosTrabalhados > 20 && anosTrabalhados <= 30)){
            aumento = salarioAtual*0.13;
        }else if(genero.equals("h") && anosTrabalhados > 30){
            aumento = salarioAtual*0.25;
        }else if(genero.equals("m") && anosTrabalhados <= 15){
            aumento = salarioAtual*0.05;
        }else if(genero.equals("m") && (anosTrabalhados > 15 && anosTrabalhados <= 20)){
            aumento = salarioAtual*0.12;
        }else if(genero.equals("m") && anosTrabalhados > 20){
            aumento = salarioAtual*0.23;
        }

        double novoSalario = salarioAtual + aumento;

        System.out.println("O novo salário será de R$" + novoSalario + ".");
    }
}
