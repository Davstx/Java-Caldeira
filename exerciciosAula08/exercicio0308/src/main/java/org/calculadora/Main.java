package org.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoAdicao = calculadora.adicao(10, 5);
        System.out.println("Resultado Adição: " + resultadoAdicao);

        double resultadoSubtracao = calculadora.subtracao(10, 5);
        System.out.println("Resultado Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicacao(10, 5);
        System.out.println("Resultado Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.divisao(10, 5);
        System.out.println("Resultado Divisão: " + resultadoDivisao);

        double resultadoRaizQuadrada = calculadora.raizQuadrada(25);
        System.out.println("Resultado Raiz Quadrada: " + resultadoRaizQuadrada);

        double resultadoPotencia = calculadora.potencia(2, 3);
        System.out.println("Resultado Potência: " + resultadoPotencia);
    }
}
