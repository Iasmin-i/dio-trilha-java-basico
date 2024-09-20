import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Agora, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o saldo da sua conta: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println(" Olá " +nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia +", conta " +numeroConta + " e seu saldo " +saldo + " já está disponível para saque.");
    }
}