import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        double saldo = 237.48;

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!%n", nome);
        System.out.printf("Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", 
                          agencia, numero, saldo);

        sc.close();
    }
}
