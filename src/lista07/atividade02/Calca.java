package lista07.atividade02;

public class Calca extends Produto{
    private String tamanho;
    private String material;

    public Calca(String descricao, Double precoCusto, String tamanho, String material){
        super(descricao, precoCusto);
        this.tamanho = tamanho;
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public Double calcularPrecoVenda(){
        return getPrecoCusto() + margemLucro();
    }

    /**
     * recebe uma margem de lucro fixa de 50%
     * @return o valor da margem de lucro
     */
    private Double margemLucro(){
        return getPrecoCusto() * 0.5;
    }
}
