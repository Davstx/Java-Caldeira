import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Compra");
            System.out.println("2. Remover Compra");
            System.out.println("3. Exibir Compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o nome da Compra: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de validade da Compra: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da Compra: ");
                    String descricao = scanner.nextLine();
                    Compra novaCompra = new Compra(nome, data, descricao);
                    lista.adicionarCompra(novaCompra);
                }
                case 2 -> {
                    System.out.print("Digite o número da Compra que deseja remover: ");
                    int indice = scanner.nextInt();
                    lista.removerCompra(indice - 1);
                }
                case 3 -> {
                    System.out.println("Lista de Compras:");
                    lista.exibirCompras();
                }
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
