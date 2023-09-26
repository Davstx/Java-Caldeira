public class Circulo extends FormaGeometrica {
    private double raio;
    private void novoRaio(double valor) {
        this.raio = valor;
    }
    @Override
    public double calcularArea() {

        return Math.PI * raio * raio;
    }
}