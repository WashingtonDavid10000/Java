import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a altura da parede: ");
        int altura = scanner.nextInt();

        int area = largura * altura;
        double litrosTinta = area / 2;

        System.out.println("Sabendo que para uma area de 2 metros será necessário 1 litro de tinta...");
        System.out.println("Você precisará de " + litrosTinta + " para pintar toda a area de uma parede de " + area + " metros.");
    }
}
