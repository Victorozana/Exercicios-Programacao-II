package lista06.exercicio05;

import java.time.LocalDate;

public class Vip extends Ingresso{
    private Double valorAdicional;

    public Vip(Double valor, LocalDate data, String nomeDoEvento, Double valorAdicional){
        super(valor, data, nomeDoEvento);
        this.valorAdicional = valor + valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void valorIngressoVip(){
        System.out.println("Valor do Ingresso VIP: "+getValorAdicional() );
    }

}
