import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaPessoas sistemaPessoas = new SistemaPessoas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Imprimir idade de uma pessoa");
            System.out.println("2. Imprimir pessoas na terceira idade");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    int idade = sistemaPessoas.getIdade(nome);
                    if (idade != -1) {
                        System.out.println("A idade de " + nome + " é " + idade + " anos.");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("Pessoas na terceira idade:");
                    sistemaPessoas.imprimirTerceiraIdade();
                    break;

                case 3:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
