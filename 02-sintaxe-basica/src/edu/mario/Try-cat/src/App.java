import java.util.Scanner;

public class App {

    public static float dividir (int numero1, int numero2)
    {
        return numero1/numero2;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.print("Digite o numerador: ");
        numero1 = scanner.nextInt();
        try {
            System.out.print("Digite o denominador: ");
            numero2 = scanner.nextInt();
            System.out.println(dividir(numero1,numero2));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível fazer uma divisão por zero.");
        }
        scanner.close();
    }
}
