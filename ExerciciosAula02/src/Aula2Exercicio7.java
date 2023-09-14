import java.util.Scanner;

public class Aula2Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos inimigos você acha que Leônidas enfrentará? ");
        int palpite = scanner.nextInt();

        scanner.close();

        if (palpite < 300000) {
            System.out.println("Um pouco mais");
        } else if (palpite > 300000) {
            System.out.println("Um pouco menos");
        } else {
            System.out.println("É... o Leônidas tem que parar de arrumar essas confusão");
        }
    }
}
