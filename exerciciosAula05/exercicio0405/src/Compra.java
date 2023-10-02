public class Compra {
    private String nome;
    private String data;
    private String descricao;

    public Compra(String nome, String data, String descricao) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }

    public String getnome(){
        return nome;
    }
    public String getData() {
        return data;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "Compra: " + nome + "(Data de validade até: " + data + ")\nDescrição: " + descricao;
    }
}