package lista08.exercicio04;

public class CartaCura extends Carta{
    public CartaCura(String nome, Integer custoMana, String descricao){
        super(nome, custoMana, descricao);
    }

    @Override
    public String efeito(){
        return "Carta Cura, repoe a vida do jogador, mas com uma condição: usa efeito de <<Mágia>> Mana em 50 pontos";
    }

    @Override
    public String usarCarta(){
        diminuiCustoMana(50);
        return "\n<<Usando>> Carta Cura"+
                "\nAumenta a Vida utilizando Mágia MANA: 50 pontos"+
                "\nDescricao: "+getDescricao();
    }
}
