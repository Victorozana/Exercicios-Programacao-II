package lista05.exercicio02;

import java.util.List;

public class Estoque {
    private final List<Produto> produtos;

    public Estoque(List<Produto> produtos){
        this.produtos = produtos;
    }

    /**
     * adiciona a lista um produto
     * @return a lista total
     */
    public List<Produto> addProduto(Produto produto){
        if (produtos.size() > 1){
            for (Produto produto1 : produtos){
                if (produto1.getCodigoDoProduto().equals(produto.getCodigoDoProduto()) && verificarProdutoEmEstoque(produto1)){
                     produto1.addQuantidade(produto.getQuantidade());
                     return produtos;
                }
            }
        }
        if (verificarProdutoEmEstoque(produto)) produtos.add(produto);

        return produtos;
    }

    /**
     * remove a quantidade de produtos descrito pelo @param quantidade baseada no @param codigoDoProduto
     * @return a quantidade total de produtos que o estoque possui
     */
    public List<Produto> remProduto(Integer codigoDoProduto, Integer quantidade){
            if (produtos.size() == 1 && verificarProdutoEmEstoque(produtos.getFirst()))produtos.getFirst().remQuantidade(quantidade);
            for (Produto produto : produtos){
                if (produto.getCodigoDoProduto().equals(codigoDoProduto) && verificarProdutoEmEstoque(produto)){
                    if (produto.getQuantidade() >= quantidade){
                        produto.remQuantidade(quantidade);
                        return produtos;
                    }
                }
            }
            return produtos;
    }

    /**
     * exibe todas as informações dos produtos em estoque
     */
    public void exibirProdutos(){
        for (Produto produto : produtos){
            System.out.println("Código do Produto: "+produto.getCodigoDoProduto());
            System.out.println("Nome: "+produto.getNome());
            System.out.println("Valor: "+produto.getValor());
            System.out.println("Marca: "+produto.getMarca());
            System.out.println("Quantidade em Estoque: "+produto.getQuantidade());
        }
    }

    /**
     * @return verifica se a quantidade do produto é válida, se for válida retorna true, se não false
     */
    private boolean verificarProdutoEmEstoque(Produto produto){
        return produto.getQuantidade() >= 0;
    }

    public List<Produto> addEstoqueProduto(Integer codigoDoProduto, Integer quantidade){
        if (produtos.size() == 1 && verificarProdutoEmEstoque(produtos.getFirst()))produtos.getFirst().addQuantidade(quantidade);
        for (Produto produto : produtos){
            if (produto.getCodigoDoProduto().equals(codigoDoProduto) && verificarProdutoEmEstoque(produto)){
                    produto.addQuantidade(quantidade);
                    return produtos;
                }
            }
        return produtos;
        }
}
