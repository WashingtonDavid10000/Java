public class Ex070 {
    public static void main(String[] args) {
        int F = 0;
        int anterior = 0;
        for(int c = 0; c <= 11; c++){
            if(c==1){
                F = 1;
                anterior = 0;
            }else{
                F += anterior;
                anterior = F - anterior;
            }
            System.out.print(F + " ");
        }
    }
}
