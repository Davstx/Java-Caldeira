import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor, digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        System.out.println("O primeiro número é " + numero1 + " e o segundo número é " + numero2);
    }
}
