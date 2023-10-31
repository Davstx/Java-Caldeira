import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int numero2 = scanner.nextInt();

            System.out.println("Escolha a operação (ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO):");
            String operacaoString = scanner.next().toUpperCase();
            Operacao operacaoEscolhida = Operacao.valueOf(operacaoString);

            OperacoesMatematicas calculadora = new OperacoesMatematicas();
            int resultado = 0;

            switch (operacaoEscolhida) {
                case ADICAO:
                    resultado = calculadora.adicionar(numero1, numero2);
                    break;
                case SUBTRACAO:
                    resultado = calculadora.subtrair(numero1, numero2);
                    break;
                case MULTIPLICACAO:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case DIVISAO:
                    resultado = calculadora.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número inteiro válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida. Use ADICAO, SUBTRACAO, MULTIPLICACAO ou DIVISAO.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
