public class Ex043{
    public static void main(String[] args) {
        for(int c = 30; c >= 0; c--){
            if(c % 4 == 0){
                System.out.print("[" + c + "] ");
            }else{
                System.out.print(c + " ");
            }
        }
    }
}