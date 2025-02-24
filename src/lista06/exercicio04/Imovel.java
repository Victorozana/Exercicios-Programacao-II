package lista06.exercicio04;

public class Imovel {
    private String endereco;
    private Double preco;

    public Imovel(String endereco, Double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public Double getPreco() {
        return preco;
    }
}
