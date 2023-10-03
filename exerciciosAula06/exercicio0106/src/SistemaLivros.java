import java.util.Stack;

public class SistemaLivros {
    private Stack<Livro> pilhaDeLivros;

    public SistemaLivros() {
        pilhaDeLivros = new Stack<>();
        pilhaDeLivros.push(new Livro("Livro A", "Ficção"));
        pilhaDeLivros.push(new Livro("Livro B", "Aventura"));
        pilhaDeLivros.push(new Livro("Livro C", "Romance"));
    }

    public void imprimirLivros() {
        for (Livro livro : pilhaDeLivros) {
            System.out.println(livro);
        }
    }

    public void imprimirPorCategoria(String categoria) {
        for (Livro livro : pilhaDeLivros) {
            if (livro.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(livro);
            }
        }
    }

    public void removerLivros() {
        while (!pilhaDeLivros.isEmpty()) {
            Livro livroRemovido = pilhaDeLivros.pop();
            System.out.println("Livro removido: " + livroRemovido);
        }
    }
}
