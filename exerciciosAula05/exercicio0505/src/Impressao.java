public class Impressao {
    private String nome;
    private String numeroPaginas;

    public Impressao(String nome, String numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getnome(){
        return nome;
    }

    public String getnumeroPaginas(){
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nome + "\n" + "Número de páginas: " + numeroPaginas;
    }
}