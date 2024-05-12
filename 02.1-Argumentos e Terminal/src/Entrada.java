import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Qual seu sobrenome? ");
        String sobrenome = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Seja bem vindo " + nome + " " + sobrenome);
    }
}
