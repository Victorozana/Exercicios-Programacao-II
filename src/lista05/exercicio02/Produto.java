package lista05.exercicio02;

public class Produto {
    private Integer codigoDoProduto;
    private String nome;
    private String marca;
    private Integer quantidade;
    private Double valor;

    public Produto(Integer codigoDoProduto, String nome, String marca, Integer quantidade, Double valor){
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }

    /**
     * adiciona a quantidade descrita @param quantidade iterando no valor total do atributo quantidade
     */
    public void addQuantidade(Integer quantidade){
        this.quantidade += quantidade;
    }

    /**
     * remove a quantidade descrita @param quantidade iterando no valor total do atributo quantidade
     */
    public void remQuantidade(Integer quantidade){
        this.quantidade -= quantidade;
    }
}
