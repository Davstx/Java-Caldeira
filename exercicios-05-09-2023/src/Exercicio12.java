import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia em dólares: ");
        double quantiaDolares = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio atual: ");
        double taxaCambio = scanner.nextDouble();

        scanner.close();

        double valorConvertido = quantiaDolares * taxaCambio;

        System.out.println("O valor convertido é: " + valorConvertido);
    }
}
