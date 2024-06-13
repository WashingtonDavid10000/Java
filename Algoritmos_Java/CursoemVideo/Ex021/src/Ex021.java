import java.util.Scanner;

public class Ex021{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if(ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0 ){
            System.out.println(ano + " é bissexto!");
        }else{
            System.out.println(ano + " não é bissexto!");
        }
    }
}