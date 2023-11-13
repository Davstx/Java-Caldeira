import org.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void somarNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.adicao(1, 2);
        Assertions.assertEquals(3, soma);
    }

    @Test
    void subtrairNumeros() {
        Calculadora calculadora = new Calculadora();
        double diferenca = calculadora.subtracao(5, 3);
        Assertions.assertEquals(2, diferenca);
    }

    @Test
    void multiplicarNumeros() {
        Calculadora calculadora = new Calculadora();
        double produto = calculadora.multiplicacao(4, 2);
        Assertions.assertEquals(8, produto);
    }

    @Test
    void dividirNumeros() {
        Calculadora calculadora = new Calculadora();
        double quociente = calculadora.divisao(10, 2);
        Assertions.assertEquals(5, quociente);
    }

    @Test
    void calcularRaizQuadrada() {
        Calculadora calculadora = new Calculadora();
        double raiz = calculadora.raizQuadrada(16);
        Assertions.assertEquals(4, raiz);
    }

    @Test
    void calcularPotencia() {
        Calculadora calculadora = new Calculadora();
        double resultadoPotencia = calculadora.potencia(2, 3);
        Assertions.assertEquals(8, resultadoPotencia);
    }
}