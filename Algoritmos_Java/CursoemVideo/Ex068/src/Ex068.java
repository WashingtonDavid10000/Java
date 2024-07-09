import java.util.Scanner;

public class Ex068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mulherQuant = 0;
        int homemAcima100 = 0;
        int mediaPesoMulher = 0;
        int maiorPesoHomem = 0;

        for(int c = 0; c < 4; c++){
            System.out.println("Digite o sexo[h/m]: ");
            String sexo = scan.next();

            System.out.println("Digite o peso: ");
            int peso = scan.nextInt();

            if(sexo.equals("m")){
                mulherQuant++;
                mediaPesoMulher += peso; 
            }

            if(sexo.equals("h") && peso > 100){
                homemAcima100++;
            }

            if(peso > maiorPesoHomem){
                maiorPesoHomem = peso;
            }
        }

        

        System.out.println("Mulheres cadastradas: " + mulherQuant);
        System.out.println("Homens acima de 100Kg: " + homemAcima100);
        if(mulherQuant == 0){
            System.out.println("Média de peso entre mulheres: " + mulherQuant);
        }else{
            System.out.println("Média de peso entre mulheres: " + (mediaPesoMulher/mulherQuant));
        }
        System.out.println("Maior peso entre os homens: " + maiorPesoHomem);

        
    }
}
