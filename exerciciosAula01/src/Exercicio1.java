import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

        scanner.close();

        System.out.println("Muito prazer, " + nome + "!");
    }
}
