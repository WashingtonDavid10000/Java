public class Ex047 {
    public static void main(String[] args) {
        int soma = 0;
        for(int c = 500; c >= 0; c = c - 50){
            System.out.print(c + " ");
            if(c != 0){
                System.out.print(" + ");
            }
            soma = soma + c;
            if (c == 0) {
                System.out.println();
            }
        }
        System.out.println("A soma entre todos os números é: " + soma);
    }
}
