import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
    public static void solicitarNumeros() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int numero2 = scanner.nextInt();

            System.out.println("Os números informados são: " + numero1 + " e " + numero2);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número inteiro válido.");
        }
    }
}
