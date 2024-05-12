package edu.mario.Operadores;

public class Operadores {
    public static void main(String[] args) {
        int idade = 100;
        String retorno = 
            idade >= 100 ? "Esqueceram de enterrar." : 
            idade >= 18 ? "Entrada liberada" : 
            "Entrada negada.";
        // if (idade >= 18) {
        //     System.err.println("Entrada liberada");
        // }else{
        //     System.out.println("Entrada negada.");
        // }
        System.err.println(retorno);
    }
}
