import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception { 
    try (Scanner sc = new Scanner(System.in)) {
        int numero;
        Double saldo;
        String agencia, nomeCliente;

        System.out.println("Digite o numero da sua conta:");
        numero = sc.nextInt();

        System.out.println("Por favo, digite o número da agência:");
        agencia = sc.nextLine();

        System.out.println("Digite o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o seu saldo atual:");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente +" obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +"e seu saldo é: "+ saldo + " já está disponível para saque");
    }

    

        
    }
}
