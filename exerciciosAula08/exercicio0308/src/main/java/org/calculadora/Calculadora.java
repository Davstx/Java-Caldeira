package org.calculadora;

public class Calculadora {

    public double adicao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double divisao(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero não permitida!");
            return Double.NaN; // Retornar um valor inválido para indicar erro
        }
    }

    public double raizQuadrada(double numero) {
        if (numero >= 0) {
            return Math.sqrt(numero);
        } else {
            System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo!");
            return Double.NaN; // Retornar um valor inválido para indicar erro
        }
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}







