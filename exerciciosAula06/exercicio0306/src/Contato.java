public class Contato {
    private String nome;
    private String telefone;
    private String endereco;
    private String localidade;

    public Contato(String nome, String telefone, String endereco, String localidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
