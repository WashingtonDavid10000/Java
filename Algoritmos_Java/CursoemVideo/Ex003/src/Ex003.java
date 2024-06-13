import java.util.Scanner;
import java.util.Locale;

public class Ex003 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.next();

        System.out.println("Digite o salário de " + nomeFuncionario + ": ");
        double salario = scanner.nextDouble();

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário: " + salario);
        System.out.println("O funcionario " + nomeFuncionario + " tem um salário de R$" + salario + " em Junho.");


    }
}
