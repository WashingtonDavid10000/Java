import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o valor da casa?: ");
        double valorCasa = scan.nextDouble();

        System.out.print("Qual o salário do comprador?: ");
        double salarioComprador = scan.nextDouble();

        System.out.print("Em quantos anos ele pretende pagar?: ");
        int anos = scan.nextInt();

        int meses = anos * 12;
        double parcelas = valorCasa / meses;

        if(parcelas >= (salarioComprador*0.3)){
            System.out.println("Empréstimo negado! o valor das parcelas é maior que 30% do salário.");
        }else{
            System.out.println("Empréstimo concluído! as parcelas serão de: R$" + parcelas + " durante " + meses + " meses.");
        }
    }
}
