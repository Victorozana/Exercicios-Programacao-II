package lista08.exercicio04;

public class CartaAtaque extends Carta{
    public CartaAtaque(String nome, Integer custoMana, String descricao){
        super(nome, custoMana, descricao);
    }

    @Override
    public String efeito(){
        return "Retira pontos de vida do jogador OPONENTE! Utiliza 50 de <<Mágia>> MANA";
    }

    @Override
    public String usarCarta(){
        diminuiCustoMana(50);
        return "\n<<Usando>> Carta Ataque"+
                "\nAfeta o inimigo em: 50 pontos de Vida"+
                "\nDescricao: "+getDescricao();
    }
}
