import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("===== Jogo de Adivinhação =====");
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = gerador.nextInt(101);
        }

        System.out.print("Digite um número: ");
        int palpite = scanner.nextInt();

        boolean numeroEstaNoArray = false;

        for (int numero : numeros) {
            if (numero == palpite) {
                numeroEstaNoArray = true;
                break;
            }
        }

        if (numeroEstaNoArray) {
            System.out.println("O número está presente no array");
        } else {
            System.out.println("O número não está no Array");
        }
        scanner.close();
    }
}




