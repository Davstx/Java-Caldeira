import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas = new SistemaReservas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Reservar Passagem");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Exibir Reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o local: ");
                    String local = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a data de entrada: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Digite a data de saída: ");
                    String dataSaida = scanner.nextLine();
                    Reserva novaReserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
                    sistemaReservas.reservarPassagem(novaReserva);
                    break;

                case 2:
                    System.out.print("Digite o número da reserva que deseja cancelar: ");
                    int indice = scanner.nextInt();
                    sistemaReservas.cancelarReserva(indice - 1);
                    break;

                case 3:
                    System.out.println("Lista de Reservas:");
                    sistemaReservas.exibirReservas();
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
