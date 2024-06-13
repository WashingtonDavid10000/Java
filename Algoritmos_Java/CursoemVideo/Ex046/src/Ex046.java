public class Ex046 {
    public static void main(String[] args) {
        int soma = 0;
        for(int c = 6; c <= 100; c = c + 2){
            System.out.print(c + " ");
            soma = soma + c;
        }
        System.out.println();
        System.out.println("A soma entre todos os números é: " + soma);
    }
}
