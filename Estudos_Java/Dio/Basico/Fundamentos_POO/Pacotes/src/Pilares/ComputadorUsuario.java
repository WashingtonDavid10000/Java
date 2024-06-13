package Pilares;
public class ComputadorUsuario {
    public static void main(String[] args){
    ServiçoMensagem smi = null;

    String appEscolhido = "msn";

    if(appEscolhido == "msn"){
        smi = new MSN();
    }else if(appEscolhido == "fbm"){
        smi = new Facebook();
    }else if(appEscolhido == "tlg"){
        smi = new Telegram();
    }

    smi.enviarMensagem();
    smi.receberMensagem();
    }
}
