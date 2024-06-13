import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura de um terreno retangular: ");
        int largura = scanner.nextInt();

        System.out.print("Digite o comprimento desse terreno retangular: ");
        int comprimento = scanner.nextInt();

        int area = largura * comprimento;
        System.out.println("Area: " + area);


        if(area >= 500){
            System.out.println("Terreno VIP!");
        }else if(area >= 100 && area < 500){
            System.out.println("Terreno Master!");
        }else{
            System.out.println("Terreno Popular!");
        }

    }
}
