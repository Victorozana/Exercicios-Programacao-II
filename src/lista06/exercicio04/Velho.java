package lista06.exercicio04;

public class Velho extends Imovel{
    private Double desconto;

    public Velho(String endereco, Double preco, Double desconto){
        super(endereco, preco);
        this.desconto = preco - desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }

    /**
     * metodo criado para retornar o valor com desconto adicional definido pelo usuario
     */
    public void valorComDesconto(){
        System.out.println("Valor s/ desconto: "+getPreco());
        System.out.println("Valor c/ desconto: "+getDesconto());
    }
}
