package lista07.atividade02;

import java.util.ArrayList;
import java.util.Collection;

public class CarrinhoCompra {
    private Collection<Produto> produtos;

    public CarrinhoCompra(){
         this.produtos = new ArrayList<>();
    }

    public Collection<Produto> addProduto(Produto p){
        produtos.add(p);
        return produtos;
    }

    public Double calcularTotal(){
         Double total = 0.0;
        for (Produto produto : produtos){
            total += produto.calcularPrecoVenda();
        }
        return total;
    }
}
