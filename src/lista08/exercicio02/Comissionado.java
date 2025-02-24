package lista08.exercicio02;

public class Comissionado extends Funcionario{
    private Double taxaDeComissao;
    private Double totalEmVendas;

    public Comissionado(String nome, String cargo, Double taxaDeComissao, Double totalEmVendas){
        super(nome, cargo);
        this.taxaDeComissao = taxaDeComissao;
        this.totalEmVendas = totalEmVendas;
    }

    public Double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public Double getTotalEmVendas() {
        return totalEmVendas;
    }

    @Override
    public Double calcularTotalAPagar() {
        return getTotalEmVendas() * (getTaxaDeComissao()/100);
    }
}
