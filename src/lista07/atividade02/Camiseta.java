package lista07.atividade02;

public class Camiseta extends Produto{
    private String tamanho;
    private String estampa;
    private Double precoFinal;

    public Camiseta(String descricao, Double precoCusto, String tamanho, String estampa){
        super(descricao, precoCusto);
        this.tamanho = tamanho;
        this.estampa = estampa;
        this.precoFinal = precoCusto + (precoCusto * 0.4);
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEstampa() {
        return estampa;
    }

    @Override
    public Double calcularPrecoVenda(){
        return precoFinal;
    }


    /**
     * da um desconto percentual, sendo retornado o valor final com o desconto
     */
    public Double desconto(Integer porcetagemDesconto){
        return precoFinal = calcularPrecoVenda() - (calcularPrecoVenda() * porcetagemDesconto / 100);
    }
}
