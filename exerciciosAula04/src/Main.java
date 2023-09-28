import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FormaGeometrica> formas = new ArrayList<>();

        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        formas.add(new Circulo(raioCirculo));

        System.out.print("Digite a base do retângulo: ");
        double baseRetangulo = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double alturaRetangulo = scanner.nextDouble();
        formas.add(new Retangulo(baseRetangulo, alturaRetangulo ));

        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();
        formas.add(new Triangulo(baseTriangulo, alturaTriangulo));

        System.out.print("Digite o tamanho dos lados do Quadrado: ");
        double ladoQuadrado = scanner.nextDouble();
        formas.add(new Quadrado(ladoQuadrado));

        System.out.print("Digite a diagonal maior do Losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor do Losango: ");
        double diagonalMenor = scanner.nextDouble();
        formas.add(new Losango(diagonalMaior, diagonalMenor));

        for (FormaGeometrica forma : formas) {
            String tipoForma = "";
            if (forma instanceof Circulo) {
                tipoForma = "Círculo";
            } else if (forma instanceof Retangulo) {
                tipoForma = "Retângulo";
            } else if (forma instanceof Triangulo) {
                tipoForma = "Triângulo";
            } else if (forma instanceof Quadrado) {
                tipoForma = "Quadrado";
            } else if (forma instanceof Losango) {
                tipoForma = "Losango";
            }

            double area = forma.calcularArea();
            System.out.println("Área do " + tipoForma + ": " + area);
        }
    }
}