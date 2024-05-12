public class MinhaClasse {
    //RUN -> java --enable-preview MinhaClasse Mário Aragão 20 1.70
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        float altura = Float.valueOf(args[3]);

        String dados = nome.concat(" ").concat(sobrenome).concat(" ");
        System.out.println(dados + idade + " anos " + altura + "m .");
        //System.out.println("Olá Mundo");
    }
}
