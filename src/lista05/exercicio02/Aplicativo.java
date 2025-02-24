package lista05.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Estoque estoque = new Estoque(produtos);

        Produto produto = new Produto(177, "Agua", "Hidrat", 2, 1.99);
        Produto produto1 = new Produto(166, "Agua gaseificada", "Hidrat", 1, 2.99);

        estoque.addProduto(produto);
        estoque.addProduto(produto1);

        Produto produto2 = new Produto(177,"Agua gaseificada", "Hidrat", 3, 2.99);

        estoque.addProduto(produto2);

        estoque.remProduto(177, 1);
        estoque.remProduto(177, 1);
        estoque.addEstoqueProduto(177, 1);

        estoque.exibirProdutos();

    }
}
