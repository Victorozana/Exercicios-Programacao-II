package lista08.exercicio03;

import javax.print.DocFlavor;

public class Roupa extends Produto{
    public Roupa(String nome, Double preco, String categoria){
        super(nome, preco, categoria);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preco: "+getPreco());
        System.out.println("Categoria Roupa: "+getCategoria());
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

}
