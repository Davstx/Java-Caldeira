import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Opções:");
        System.out.println("1 - Gestante");
        System.out.println("2 - Idosa");
        System.out.println("3 - Pessoa com Deficiência (PCD)");
        System.out.println("4 - Nenhuma das alternativas");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        scanner.close();

        boolean temDireitoFilaPrioritaria = (opcao == 1 || opcao == 2 || opcao == 3);

        if (temDireitoFilaPrioritaria) {
            System.out.println("Você tem direito à fila prioritária, dirija-se a ela ou à fila padrão.");
        } else {
            System.out.println("Dirija-se à fila padrão.");
        }
    }
}
