package lista08.exercicio03;

public class Livro extends Produto implements IDescontavel{
    private Double PorcentagemDesconto;

    public Livro(String nome, Double preco, String categoria){
        super(nome, preco, categoria);
        this.PorcentagemDesconto = 0.0;
    }

    public Double getPorcentagemDesconto() {
        return PorcentagemDesconto;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preco: "+getPreco());
        System.out.println("Categoria Livro: "+getCategoria());
    }

    /**
     * @param porcentagemDesconto o desconto só será concedido se o usuário digitar de 5% mínimo e 10% máximo
     */
    public void definirDesconto(Double porcentagemDesconto){
        this.PorcentagemDesconto = (porcentagemDesconto >= 5 && porcentagemDesconto <= 10) ? porcentagemDesconto / 100 : null;
    }

    @Override
    public Double calcularDesconto(){
        return preco = getPreco() - (getPorcentagemDesconto() * getPreco());
    }
}
