public class Carro extends Veiculo {
    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.20;
    }
}
