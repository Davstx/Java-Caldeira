import java.util.Scanner;

public class Aula2Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            int escolha = scanner.nextInt();

            double resultado = 0.0;
            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Você Deseja continuar? (sim/não): ");
            continuar = scanner.next();
        }

        scanner.close();
    }
}