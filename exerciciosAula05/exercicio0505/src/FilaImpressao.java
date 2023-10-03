import java.util.LinkedList;

public class FilaImpressao {
    private LinkedList<Impressao> listaDeImpressaos;

    public FilaImpressao() {
        listaDeImpressaos = new LinkedList<>();
    }

    public void adicionarImpressao(Impressao Impressao) {
        listaDeImpressaos.add(Impressao);
    }

    public void removerImpressao(int indice) {
        if (indice >= 0 && indice < listaDeImpressaos.size()) {
            listaDeImpressaos.remove(indice);
            System.out.println("Documento removido com sucesso.");
        } else {
            System.out.println("Índice inválido. Nenhuma Impressao removida.");
        }
    }

    public void exibirImpressaos() {
        for (int i = 0; i < listaDeImpressaos.size(); i++) {
            System.out.println("Impressao #" + (i + 1) + ":\n" + listaDeImpressaos.get(i) + "\n");
        }
    }
}