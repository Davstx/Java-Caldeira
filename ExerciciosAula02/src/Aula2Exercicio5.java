import java.util.Scanner;

public class Aula2Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        scanner.close();

        int tamanho = entrada.length();
        int meio = tamanho / 2;
        String primeiraParte = entrada.substring(0, meio);

        System.out.println("A primeira metade da string é: " + primeiraParte);
    }
}
