import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana (em maiúsculas):");
        String input = scanner.next();

        try {
            DiaDaSemana dia = DiaDaSemana.valueOf(input);

            switch (dia) {
                case SEGUNDA:
                case TERCA:
                case QUARTA:
                case QUINTA:
                case SEXTA:
                    System.out.println("Dia útil!");
                    break;
                case SABADO:
                case DOMINGO:
                    System.out.println("Final de semana!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido.");
        }

        scanner.close();
    }
}
