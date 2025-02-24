package lista06.exercicio04;

public class Novo extends Imovel{
    private Double adicional;

    public Novo(String endereco, Double preco, Double adicional){
        super(endereco, preco);
        this.adicional = adicional + preco;
    }

    public Double getAdicional() {
        return adicional;
    }

    /**
     * metodo criado para exibir o valor com o adicional inserido pelo usuario
     */
    public void valorComAdicional(){
        System.out.println("Preco s/ adicional: "+getPreco());
        System.out.println("Preco c/ adicional: "+getAdicional());
    }

}
