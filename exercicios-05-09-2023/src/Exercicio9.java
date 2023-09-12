import java.util.Scanner;
import java.time.Year;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.close();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}