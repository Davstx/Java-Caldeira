import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("===== Jogo de Adivinhação =====");
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = gerador.nextInt(101);
        }
        System.out.println(java.util.Arrays.toString(numeros));
        System.out.print("Digite um número: ");
        int palpite = scanner.nextInt();

        if (Arrays.asList(numeros).contains(palpite)) {
            System.out.println("O número está presente no array");
        } else {
            System.out.println("O número não está no Array");
        }
    }
}