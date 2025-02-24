package lista06.exercicio05;

import java.time.LocalDate;

public class Normal extends Ingresso{
    public Normal(Double valor, LocalDate data, String nomeDoEvento){
        super(valor, data, nomeDoEvento);
    }

    public void valorIngresso(){
        System.out.println("Valor: "+getValor());
    }

    public void imprimirIngressoNormal(){
        System.out.println("Valor do Ingresso Normal: "+getValor());
    }
}
