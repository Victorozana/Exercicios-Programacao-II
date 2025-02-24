package lista08.exercicio04;

public class CartaDefesa extends Carta{
    public CartaDefesa(String nome, Integer custoMana, String descricao){
        super(nome, custoMana, descricao);
    }

    @Override
    public String efeito(){
        return "Defende o jogador recuperando <<Mágia>> Mana para se preparar para o ataque! ";
    }

    @Override
    public String usarCarta(){
        aumentaCustoMana(50);
        return "\n<<Usando>> Carta Defesa"+
                "\nAumenta o MANA: 50 pontos"+
                "\nDescricao: "+getDescricao();
    }
}
