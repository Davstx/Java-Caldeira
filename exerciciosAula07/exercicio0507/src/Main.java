import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida! A idade deve estar entre 0 e 150 anos.");
            } else {
                System.out.println("Idade válida: " + idade + " anos.");
            }
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida para idade.");
        }
    }
}
