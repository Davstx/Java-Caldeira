import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        scanner.close();

        if (idade >= 18 && salario > 2000.00) {
            System.out.println("Você pode comprar um automóvel.");
        } else {
            System.out.println("Você não pode comprar um automóvel.");
        }
    }
}