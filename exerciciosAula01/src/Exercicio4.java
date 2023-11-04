import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double salarioMinimo = 1320.00;

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        scanner.close();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        quantidadeSalariosMinimos = Math.round(quantidadeSalariosMinimos * 100.0) / 100.0;

        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}