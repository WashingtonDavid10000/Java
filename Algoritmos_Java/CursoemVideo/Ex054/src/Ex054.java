import java.util.Scanner;

public class Ex054{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAltura = 0;
        int noventaMais = 0;
        int menorPesoAltura = 0;
        int maiorPesoAltura = 0;

        int c = 0;
        while(c < 7){
            c++;
            System.out.println("Digite o peso da pessoa: ");
            double peso = scan.nextDouble();

            System.out.println("Digite a altura da pessoa: ");
            double altura = scan.nextDouble();

            mediaAltura = mediaAltura + altura;

            if(peso > 90){
                noventaMais++;
            }
            if(peso < 50 && altura < 1.60){
                menorPesoAltura++;
            }
            if(peso > 100 && altura > 1.90){
                maiorPesoAltura++;
            }
        }

        System.out.println("Média de altura: " + (mediaAltura/7));
        System.out.println("Quantas pessoas pesam mais que 90KG: " + noventaMais);
        System.out.println("Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m: " + menorPesoAltura);
        System.out.println("Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg: " + maiorPesoAltura);

    }
}