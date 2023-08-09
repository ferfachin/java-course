package edu.fernando.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;

        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Mediana");
        else
            System.out.println("Aprovado!");
    }
}
