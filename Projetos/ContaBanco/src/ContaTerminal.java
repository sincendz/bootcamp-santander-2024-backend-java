import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void inserirNomeCliente(String nome){
        nomeCliente = nome;
    }

    public void inserirNumeroConta(int numero){
        this.numero = numero;
    }

    public void inserirAgencia(String agencia){
        this.agencia = agencia;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

    public void informacoes(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numero + "e seu saldo " + saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        contaTerminal.inserirNomeCliente(nomeCliente);

        System.out.print("Digite sua Agencia: ");
        String agencia = scanner.nextLine();
        contaTerminal.inserirAgencia(agencia);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        contaTerminal.inserirNumeroConta(numeroConta);

        System.out.print("Digite o valor que deseja depositar: ");
        double deposito = scanner.nextDouble();
        contaTerminal.depositar(deposito);

        contaTerminal.informacoes();

        scanner.close();
    }
}
