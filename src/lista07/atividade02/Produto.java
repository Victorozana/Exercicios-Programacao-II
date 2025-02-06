package lista07.atividade02;

public abstract class Produto {
    private String descricao;
    private Double precoCusto;

    public Produto(String descricao, Double precoCusto){
        this.descricao = descricao;
        this.precoCusto = precoCusto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public abstract Double calcularPrecoVenda();
}
