package edu.mario.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        /*
         * Toda variável float em java deve terminar com um F
         * 
         */
        float salario = 2500.2F;
        System.err.println(salario);

        /*
         * Caso seja necessário converter um tipo de dado para outro nos podemos usar o operador de cast
         */
        float idade = 20F;
        int idadeMario = (int) idade;
        System.out.println("Meu nome é Mário e eu tenho " + idadeMario + " anos.");
    }
}
