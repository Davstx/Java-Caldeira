import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<Compra> listaDeCompras;

    public ListaCompras() {
        listaDeCompras = new ArrayList<>();
    }

    public void adicionarCompra(Compra Compra) {
        listaDeCompras.add(Compra);
    }

    public void removerCompra(int indice) {
        if (indice >= 0 && indice < listaDeCompras.size()) {
            listaDeCompras.remove(indice);
            System.out.println("Compra removida com sucesso.");
        } else {
            System.out.println("Índice inválido. Nenhuma Compra removida.");
        }
    }

    public void exibirCompras() {
        for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println("Compra #" + (i + 1) + ":\n" + listaDeCompras.get(i) + "\n");
        }
    }
}