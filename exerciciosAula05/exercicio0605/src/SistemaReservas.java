import java.util.LinkedList;
import java.util.List;

public class SistemaReservas {
    private List<Reserva> listaDeReservas;

    public SistemaReservas() {
        listaDeReservas = new LinkedList<>();
    }

    public void reservarPassagem(Reserva reserva) {
        listaDeReservas.add(reserva);
    }

    public void cancelarReserva(int indice) {
        if (indice >= 0 && indice < listaDeReservas.size()) {
            listaDeReservas.remove(indice);
            System.out.println("Reserva cancelada com sucesso.");
        } else {
            System.out.println("Índice inválido. Nenhuma reserva cancelada.");
        }
    }

    public void exibirReservas() {
        for (int i = 0; i < listaDeReservas.size(); i++) {
            System.out.println("Reserva #" + (i + 1) + ":\n" + listaDeReservas.get(i) + "\n");
        }
    }
}
