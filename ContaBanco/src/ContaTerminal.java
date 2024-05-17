import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int Numero;
        String Agencia,NomeCliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite o número da Agência:");
        Agencia = sc.next();
        System.out.println("Por favor, agora digite o número da conta:");
        Numero = sc.nextInt();
        System.out.println("Digite o seu nome:");
        NomeCliente = sc.next();
        System.out.println("Agora, digite o valor para saque");
        Saldo = sc.nextDouble();


        System.out.println("Olá " +NomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", Numero: " + Numero + ", e o seu saldo " + Saldo%.2 + " já está disponível para saque");
        






    }
}
