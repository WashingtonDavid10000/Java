package edu.washington.segundaSemana;
public class MinhaClasse {
    
public static void main (String [] args) {

    String primeiroNome = "Washington";
    String segundoNome = "David";
    String terceiroNome = "Batista";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);

    System.out.print(nomeCompleto);

}

public static String nomeCompleto(String primeiroNome, String segundoNome, String terceiroNome){
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
}

}
