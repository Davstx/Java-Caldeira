import java.util.Scanner;

    public class Exercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a temperatura em graus Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();

            scanner.close();

            double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

            System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);
        }
    }
