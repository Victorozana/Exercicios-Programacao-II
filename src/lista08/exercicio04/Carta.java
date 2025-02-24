package lista08.exercicio04;

public abstract class Carta implements IJogavel{
    private String nome;
    private Integer custoMana;
    private String descricao;

    public Carta(String nome, Integer custoMana, String descricao){
        this.nome = nome;
        this.custoMana = custoMana;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCustoMana() {
        return custoMana;
    }

    public void diminuiCustoMana(Integer custoMana){this.custoMana += custoMana;}
    public void aumentaCustoMana(Integer custoMana){this.custoMana -= custoMana;}


    public abstract String efeito();
}
