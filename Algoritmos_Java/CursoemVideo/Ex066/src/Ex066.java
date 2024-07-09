import java.util.Scanner;

public class Ex066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        int res = 0;
        for(int c = 1; c <= 10; c++){
            res = num * c;
            System.out.println(num + " x " + c + " = " + res);
        }
    }
}
