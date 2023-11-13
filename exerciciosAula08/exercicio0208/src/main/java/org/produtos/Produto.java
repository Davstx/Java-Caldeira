package org.produtos;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "nome = " + nome +
                ", preço = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }
}
