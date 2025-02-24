package lista06.exercicio05;

import java.time.LocalDate;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(Double valor, LocalDate data, String nomeDoEvento, Double valorAdicional, String localizacao){
        super(valor, data, nomeDoEvento, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}
