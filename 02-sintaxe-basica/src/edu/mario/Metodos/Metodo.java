package edu.mario.Metodos;


public class Metodo {
    /*
    * Critérios de nomeação de métodos.
    *  1- Devem ser declarados como verbos. 
    *  2- Padrão camelCase.
    * 
    */
    public static int somar (int numero1, int numero2)
    {
        return numero1 + numero2;
    }
    public static String fullName (String firstName, String endName)
    {
        return firstName.concat(" ").concat(endName);
    }
    public static void main(String[] args) {
        System.err.println(fullName("Mário", "Aragão"));
    }
}
