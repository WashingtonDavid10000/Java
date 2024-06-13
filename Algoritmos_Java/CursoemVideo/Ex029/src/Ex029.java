import java.util.Scanner;

public class Ex029{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.print("Digite o salário de " + nome + ": ");
        double salario = scanner.nextDouble();

        System.out.print("A quantos anos " + nome + " trabalha nessa empresa?: ");
        int anosTrabalhados = scanner.nextInt();
        
        double novoSalario = 0;

        if(anosTrabalhados <= 3){
            novoSalario = salario + (salario*0.03);
        }else if(anosTrabalhados > 3 && anosTrabalhados <= 10){
            novoSalario = salario + ((salario*12.5)/100);
        }else{
            novoSalario = salario + (salario*0.20);
        }

        System.out.println("Novo salário de " + nome + ": R$" + novoSalario);
    }
}