package lista04.exercicio1;

import lista03.exercicio02.Proprietario;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private Double preco;
    private LocalDate dataValidade;
    private String codigoBarras;
    private Integer quantidadeEmEstoque;

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(Integer quantidadeEmEstoque, String nome, Double preco, LocalDate dataValidade, String codigoBarras) {
        this(nome, preco);
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.dataValidade = dataValidade;
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    /**
     * verifica se a data de validade está em dia do produto;
     * @param dataValidade inserida pelo usuário do produto
     * @return
     */
    public boolean prazoValidade(LocalDate dataValidade){
        LocalDate hoje = LocalDate.now();
        return dataValidade.isEqual(hoje);
    }

    /**
     * calcula o valor total
     * @return
     */
    private Double valorTotal(){
        return preco * quantidadeEmEstoque;
    }

    /**
     * atualiza a quantidade de estoque para exibir na tela principal do usuário
     * @param quantidadeEmEstoque
     */
    protected void atualizaQuantidade(Integer quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    /**
     * retorna as informações do produto, como nome preõ e validade!
     * @return
     */
    @Override
    public String toString() {
        return "Produto :" +
                "\n nome = " + nome +
                "\n preco = " + preco +
                "\n data de validade = " + dataValidade +
                "\n codigo de barras = " + codigoBarras +
                "\n quantidade em estoque = " + quantidadeEmEstoque;
    }

    /**
     * @return aplica um desconto ao usuário de 5%
     */
    public Double desconto(){
        return preco = preco - (preco * 0.05);
    }
}
