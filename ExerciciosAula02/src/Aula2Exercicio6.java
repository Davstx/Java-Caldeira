import java.util.Scanner;

public class Aula2Exercicio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        scanner.close();

        String stringReversa = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            stringReversa += entrada.charAt(i);
        }

        System.out.println("A string ao contrário é: " + stringReversa);
    }
}