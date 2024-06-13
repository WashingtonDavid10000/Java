import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double distancia = scanner.nextDouble();

        System.out.println("A distância de " + distancia + " corresponde a: ");
        System.out.println(distancia / 1000 + "Km");
        System.out.println(distancia / 100 + "Hm");
        System.out.println(distancia / 10 + "Dam");
        System.out.println(distancia * 10 + "dm");
        System.out.println(distancia * 100 + "cm");
        System.out.println(distancia * 1000 + "mm");
    }
}
