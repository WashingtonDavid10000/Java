import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Popular == p");
        System.out.println("Luxo == l");

        System.out.print("Qual tipo de carro vocÊ escolheu?[p/l]: ");
        String carroTipo = scan.next();

        System.out.print("Por quantos dias o carro foi alugado?: ");
        int diasAlugados = scan.nextInt();

        System.out.print("Quantos Km foram percorridos com o carro?: ");
        double kmPercorridos = scan.nextInt();

        if(carroTipo.equals("p")){
            diasAlugados = diasAlugados * 90;
            if(kmPercorridos <= 100){
                kmPercorridos = kmPercorridos * 0.20;
            }else if(kmPercorridos > 100){
                kmPercorridos = kmPercorridos * 0.10;
            }
            double total = diasAlugados + kmPercorridos;
            System.out.println("Você terá que pagar R$" + diasAlugados + " pelos dias alugados.");
            System.out.println("Você terá que pagar R$" + kmPercorridos + " pelos Km percorridos.");
            System.out.println("Totalizando: R$" + total);
        }else if(carroTipo.equals("l")){
            diasAlugados = diasAlugados * 150;
            if(kmPercorridos <= 200){
                kmPercorridos = kmPercorridos * 0.30;
            }else if(kmPercorridos > 200){
                kmPercorridos = kmPercorridos * 0.25;
            }
            double total = diasAlugados + kmPercorridos;
            System.out.println("Você terá que pagar R$" + diasAlugados + " pelos dias alugados.");
            System.out.println("Você terá que pagar R$" + kmPercorridos + " pelos Km percorridos.");
            System.out.println("Totalizando: R$" + total);
        }
    }
}
