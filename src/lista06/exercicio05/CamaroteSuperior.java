package lista06.exercicio05;

import java.time.LocalDate;

public class CamaroteSuperior extends Vip{
    private Double valorAdicionalPlus;
    private String localizacao;

    public CamaroteSuperior(Double valor, LocalDate data, String nomeDoEvento, Double valorAdicional, String localizacao, Double valorAdicionalPlus){
        super(valor, data, nomeDoEvento, valorAdicional);
        this.localizacao = localizacao;
        this.valorAdicionalPlus = valorAdicionalPlus + valor + valorAdicional;
    }

    public Double getValorAdicionalPlus() {
        return valorAdicionalPlus;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirValorCamarote(){
        System.out.println("Valor do Camarote Superior: "+getValorAdicionalPlus());
    }
}
