package lista06.exercicio05;

import java.time.LocalDate;

public class Ingresso {
    private Double valor;
    private LocalDate data;
    private String nomeDoEvento;

    public Ingresso(Double valor, LocalDate data, String nomeDoEvento) {
        this.valor = valor;
        this.data = data;
        this.nomeDoEvento = nomeDoEvento;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void imprimirValor(){
        System.out.println("Valor do Ingresso: "+getValor());
    }

    public void imprimirDadosDoEvento(){
        System.out.println("Data: "+getData());
        System.out.println("Nome do Evento: "+getNomeDoEvento());
    }
}
