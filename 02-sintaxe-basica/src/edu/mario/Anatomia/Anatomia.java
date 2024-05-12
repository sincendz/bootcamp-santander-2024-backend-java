package edu.mario.Anatomia;
public class Anatomia {
    public static void main(String[] args) {
        /*
         * Variáveis escritas com letra maiúscula são por convenção imutáveis.
         * Porém, para garantir mais segurança, usamos a palavra reservada 'final' para que sinalize para o
         * java que a variável não poderá ter seu valor alterado.
        */
        final String CE = "Ceará";
        final double PI = 3.1415;
        System.out.println(PI);
        System.out.println(CE);

        /*
         * Por convenção, as variáveis devem ser escritas com letra minuscula. Porém, variáveis que  expressão mais de uma informação
         * como : anoFabricação devem ser escritas usando camelCase.
         */
        int idade = 20;
        int anoFabricacao = 2024;
        System.out.println("Eu tenho " + idade + " anos" + " e o ano de fabricação da minha moto eh " + anoFabricacao + " ");

        /*
         * Ao declarar variáveis, escolha uma língua para definir seus nomes, caso seja o inglês, declare todas as variáveis em
         * ingles, nada de ficar mesclando idiomas.
         * Não é recomendado abreviar os nomes de variáveis.
         */
        int salMedio = 2000; //Não usar 
        int salarioMedio = 2000; //Recomendação 
    }
}
