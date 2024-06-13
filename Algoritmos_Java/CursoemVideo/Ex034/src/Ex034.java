import java.util.Scanner;

public class Ex034{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = scan.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = scan.nextDouble();

        double IMC = peso / (altura*altura);

        System.out.println("IMC: " + IMC);

        if (IMC < 18.5) {
            System.out.println("Status: Abaixo do peso.");
        }else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Status: Peso ideal.");
        }else if (IMC >= 25 && IMC < 30) {
            System.out.println("Status: Sobrepeso.");
        }else if (IMC >= 30 && IMC < 40) {
            System.out.println("Status: Obesidade.");
        }else if(IMC >= 40){
            System.out.println("Status: Obesidade mórbida!");
        }
    }
}