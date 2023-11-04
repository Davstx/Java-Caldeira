import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextInt();

        scanner.close();

        double maior = Math.max(Math.max(numero1, numero2), numero3);
        double menor = Math.min(Math.min(numero1, numero2), numero3);
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
    }
}
