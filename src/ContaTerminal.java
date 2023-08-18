import java.util.Scanner;
import com.java.bank.ContaBanco;

public class ContaTerminal {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Por favor, digite o número de sua Agência: ");
          String agencia = scanner.nextLine();

          System.out.print("Por favor, digite o número de sua Conta: ");
          int numero = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Por favor, digite o seu nome: ");
          String nomeCliente = scanner.nextLine();

          System.out.print("Por favor, digite o saldo da conta: ");
          double saldo = Double.parseDouble(scanner.nextLine());

          ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

          System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco,");
          System.out.println("A agência é " + conta.getAgencia() + ", o número da conta é " + conta.getNumero()
                    + " e o saldo do cliente é de "
                    + conta.getSaldo());

          scanner.close();
     }
}
