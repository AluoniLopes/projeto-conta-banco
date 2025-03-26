import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, insira seu 1º nome:");
            String nome = scanner.next();

            System.out.println("Por favor, insira seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Por favor, insira uma Agencia:");
            String agencia = scanner.next();

            System.out.println("Por favor, insira o numero da Conta:");
            int numero = scanner.nextInt();

            System.out.println("Por favor, insira o saldo disponível:");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + " " + sobrenome
                    + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero
                    + " e seu saldo R$" + saldo + " já está disponível para saque");
        } catch (Exception e) {
            System.out.println("Encerrado: " + e.toString());
        }
    }
}
