package org.produtos;

public class Main {
    public static void main(String[] args) {
        ClassificacaoProdutos classificacaoProdutos = new ClassificacaoProdutos();
        System.out.println("Produto mais caro: " + classificacaoProdutos.produtoMaisCaro);
        System.out.println("Preço total dos produtos: " + classificacaoProdutos.PrecoTotal);
        System.out.println("Produtos com mais de 10 unidades:");
        for (Produto produto : classificacaoProdutos.ProdutosCom10Un) {
            System.out.println(produto);
        }
    }
}