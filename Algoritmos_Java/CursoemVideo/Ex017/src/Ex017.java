import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro: ");
        int velocidadeCarro = scanner.nextInt();

        if(velocidadeCarro > 80){
            int multa = velocidadeCarro - 80;
            System.out.println("Você ultrapassou a velocidade permitida, Multado!");
            System.out.println("Para cada KM, deverá pagar R$5...");
            System.out.println("Sua multa será no valor de R$" + multa);
        }

    }
}
