import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor a sacar:");
            double valorSaque = scanner.nextDouble();

            conta.sacar(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante o saque.");
        }
    }
}
