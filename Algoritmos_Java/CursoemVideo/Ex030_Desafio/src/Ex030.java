import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da 1º reta: ");
        int reta1 = scanner.nextInt();

        System.out.print("Digite o comprimento da 2º reta: ");
        int reta2 = scanner.nextInt();

        System.out.print("Digite o comprimento da 3º reta: ");
        int reta3 = scanner.nextInt();

        if(reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2){
            System.out.println("Pode formar um triângulo!");
            if(reta1 == reta2 && reta2 == reta3){
                System.out.println("Esse triângulo é equilátero!");
            }else if((reta1 == reta2 && reta1 != reta3) || (reta1 == reta3 && reta1 != reta2) || (reta2 == reta3 && reta2 != reta1)){
                System.out.println("Esse triângulo é Isósceles!");
            }else if(reta1 != reta2 && reta1 != reta3){
                System.out.println("Esse triângulo é Escaleno!");
            }
        }else{
            System.out.println("Não pode formar um triângulo!");
        }
    }
}
