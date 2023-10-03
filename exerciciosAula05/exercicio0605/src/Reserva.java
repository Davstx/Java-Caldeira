public class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nLocal: " + local +
                "\nCPF: " + cpf +
                "\nData de Entrada: " + dataEntrada +
                "\nData de Saída: " + dataSaida;
    }
}
