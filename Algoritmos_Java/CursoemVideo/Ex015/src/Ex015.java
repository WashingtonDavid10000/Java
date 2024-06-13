import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        int salarioFinal = diasTrabalhados * (8*25);

        System.out.println("Sabendo que ele trabalha 8 horas por dia e recebe R$25 por hora");
        System.out.println("Com " + diasTrabalhados + " dias trabalhados, ele receberá R$" + salarioFinal + ".");
    }
}
