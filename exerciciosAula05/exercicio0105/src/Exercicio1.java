import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[5];

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        numeros[0] = numero1;

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        numeros[1] = numero2;

        System.out.println("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();
        numeros[2] = numero3;

        System.out.println("Digite o quarto número: ");
        int numero4 = scanner.nextInt();
        numeros[3] = numero4;

        System.out.println("Digite o quinto número: ");
        int numero5 = scanner.nextInt();
        numeros[4] = numero5;

        int total = 0;
        for (int numero : numeros ) {
            total += numero ;
        }
        System.out.println("A soma dos números digitados é: " + total);
        total = total/5;
        System.out.println("A média dos números digitados é: " + total);
    }
}