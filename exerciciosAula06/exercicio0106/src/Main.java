import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaLivros sistemaLivros = new SistemaLivros();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Imprimir todos os livros");
            System.out.println("2. Imprimir por categoria");
            System.out.println("3. Remover livros (até esvaziar a pilha)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Livros na pilha:");
                    sistemaLivros.imprimirLivros();
                    break;

                case 2:
                    System.out.print("Digite a categoria para imprimir os livros: ");
                    String categoria = scanner.nextLine();
                    System.out.println("Livros na categoria " + categoria + ":");
                    sistemaLivros.imprimirPorCategoria(categoria);
                    break;

                case 3:
                    System.out.println("Removendo livros...");
                    sistemaLivros.removerLivros();
                    break;

                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
