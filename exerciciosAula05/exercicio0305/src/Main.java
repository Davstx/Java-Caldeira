import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(titulo, data, descricao);
                    lista.adicionarTarefa(novaTarefa);
                    break;

                case 2:
                    System.out.print("Digite o número da tarefa que deseja remover: ");
                    int indice = scanner.nextInt();
                    lista.removerTarefa(indice - 1);
                    break;

                case 3:
                    System.out.println("Lista de Tarefas:");
                    lista.exibirTarefas();
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
