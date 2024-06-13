import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas as horas você práticou atividades físicas no mês?: ");
        int horas = scan.nextInt();
        int pontos;

        if(horas <= 10){
            pontos = horas * 2;
        }else if(horas > 10 && horas <= 20){
            pontos = horas * 5;
        }else{
            pontos = horas * 10;
        }

        System.out.println("Você praticou " + horas + "h no mês e ganhou " + pontos + " pontos por isso!");
        System.out.println("Você receberá um total de R$" + pontos*0.05 + ".");
    }
}
