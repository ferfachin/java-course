package edu.fernando.segundasemana;

public class MinhClass {
    public static void main (String [] args) {
        String primeiroNome = "Fernando";
        String segundoNome = "Fachin";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo" + " " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
