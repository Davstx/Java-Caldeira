import java.util.Scanner;
public class Aula2Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();
        String numerosPrimos = "";

        for (int i = 2; i <= numero2; i++){
            int contadorResto0 = 0;
            for (int divisor = 1; divisor <= i; divisor++) {
                if (i % divisor == 0) {
                    contadorResto0++;
                }
            }
            if (contadorResto0 == 2 && i >= numero1) {
                numerosPrimos += i + " ";
            }
        }
        System.out.println("Os números primos no intervalo são: " + numerosPrimos);
    }
}