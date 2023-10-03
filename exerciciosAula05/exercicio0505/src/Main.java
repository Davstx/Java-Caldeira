import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FilaImpressao lista = new FilaImpressao();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Impressão");
            System.out.println("2. Remover Impressão");
            System.out.println("3. Exibir Impressões");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do documento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a descrição do documento: ");
                    String paginas = scanner.nextLine();
                    Impressao novaImpressao = new Impressao(nome, paginas);
                    lista.adicionarImpressao(novaImpressao);
                    break;

                case 2:
                    System.out.print("Digite o número da Impressao que deseja remover: ");
                    int indice = scanner.nextInt();
                    lista.removerImpressao(indice - 1);
                    break;

                case 3:
                    System.out.println("Lista de Impressões:");
                    lista.exibirImpressaos();
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