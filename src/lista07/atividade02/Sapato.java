package lista07.atividade02;

public class Sapato extends Produto{
    private String tipo;
    private Integer numero;

    public Sapato(String descricao, Double precoCusto, String tipo, Integer numero){
        super(descricao, precoCusto);
        this.tipo = tipo;
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Double calcularPrecoVenda(){
        return (getPrecoCusto() * 0.4) - impostoTamanho() + getPrecoCusto();
    }

    /**
     * imposto criado para taxar conforme o tamanho do sapato
     */
    private Double impostoTamanho(){
        if (numero < 10){
            return getPrecoCusto() * 0.01;
        } else if (numero > 10) {
            return getPrecoCusto() * 0.02;
        }
        return 0.0;
    }
}
