package lista08.exercicio03;

public class Eletronico extends Produto implements IDescontavel{
    public Eletronico(String nome, Double preco, String categoria){
        super(nome, preco, categoria);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preco: "+getPreco());
        System.out.println("Categoria Eletronico: "+getCategoria());
     }

    /**
     * @return o valor total do produto já com o desconto de até 10% aplicado
     */
    @Override
    public Double calcularDesconto(){
        return preco = preco - (preco * 0.10);
     }
}
