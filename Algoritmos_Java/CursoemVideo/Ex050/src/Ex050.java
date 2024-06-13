import java.util.Random;

public class Ex050 {
    public static void main(String[] args){
        Random rand = new Random();
        int acima5 = 0;
        int divTres = 0;

        for(int c = 0; c < 20; c++){
            int num = rand.nextInt(11);
            System.out.print(num + " ");
            if(num > 5){
                acima5 = acima5 + 1;
            }
            if(num % 3 == 0){
                divTres = divTres + 1;
            }
        }
        System.out.println();
        System.out.println(acima5 + " números são maiores que 5");
        System.out.println(divTres + " números são divisiveis por 3");

    }
}
