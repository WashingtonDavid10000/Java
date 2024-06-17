import java.util.Scanner;

public class Ex057{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String flag = "continuar";
        double salarioFuncionario = 0;
        String sexo = "";

        double salarioTotal_H = 0;
        double salarioTotal_M = 0;

        while(flag != "parar"){
            System.out.println("Digite o salário do Funcionário: ");
            salarioFuncionario = scan.nextDouble();
        
            System.out.println("Digite o sexo do Funcionário[h/m]: ");
            sexo = scan.next();

            if(sexo.equals("h")){
                salarioTotal_H = salarioTotal_H + salarioFuncionario;
            }else if(sexo.equals("m")){
                salarioTotal_M = salarioTotal_M + salarioFuncionario;
            }
            
            System.out.println("Deseja continuar?[s/n]: ");
            String cont = scan.next();

            if(cont.equals("n")){
                flag = "parar";
                System.out.println("Programa encerrado.");
            }else if(cont.equals("s")){
                flag = "continuar";
            }
        }

        System.out.println("Total pago aos homens: R$" + salarioTotal_H);
        System.out.println("Total pago as mulheres: R$" + salarioTotal_M);
        
    }
}