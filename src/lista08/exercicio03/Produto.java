package lista08.exercicio03;

public abstract class Produto{
    String nome;
    Double preco;
    String categoria;

    public Produto(String nome, Double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    abstract void exibirDetalhes();
}
