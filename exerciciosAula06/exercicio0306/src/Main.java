import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Imprimir contatos em ordem alfabética");
            System.out.println("2. Imprimir contatos por localidade");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Contatos em ordem alfabética:");
                    agendaTelefonica.imprimirContatosOrdemAlfabetica();
                    break;

                case 2:
                    System.out.print("Digite a localidade para imprimir os contatos: ");
                    String localidade = scanner.nextLine();
                    System.out.println("Contatos na localidade " + localidade + ":");
                    agendaTelefonica.imprimirContatosPorLocalidade(localidade);
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
