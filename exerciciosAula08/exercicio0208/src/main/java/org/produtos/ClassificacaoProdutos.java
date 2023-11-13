package org.produtos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClassificacaoProdutos {
    List<Produto> listaProdutos = Arrays.asList(
            new Produto("Nintendo Switch", 2000, 10),
            new Produto("xícara", 40, 100),
            new Produto("Óculos", 200, 70),
            new Produto("Geladeira", 1000, 50),
            new Produto("Teclado", 100, 20)
    );

    public Produto produtoMaisCaro = listaProdutos.stream()
            .max(Comparator.comparingDouble(produto -> produto.preco))
            .orElse(null);

    public double PrecoTotal = listaProdutos.stream()
            .mapToDouble(produto -> produto.preco * produto.quantidade)
            .reduce(0, Double::sum);

    public List<Produto> ProdutosCom10Un = listaProdutos.stream()
                .filter(produto -> produto.quantidade > 10)
                .collect(Collectors.toList());
}


