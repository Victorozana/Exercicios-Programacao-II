package lista08.exercicio04;

public class MiniJogo {
    public static void main(String[]  args) {
        CartaCura cura = new CartaCura("SAQUISÔNICA DOS DESEJOS", 50, "A Carta Cura transforma pontos de MANA em Vida, durante o jogo o Jogador tem apenas 50 pontos de Mágia para usar essa carta poderosa, mas só pode ser usada quando for atacado!");
        CartaAtaque ataque = new CartaAtaque("ESPADA FUMEGANTE", 50, "A Carta Ataque, usa pontos de Mágia para afetar seu adversário, se seu adversário não tiver pontos de Mana suficiente para se proteger ele perde vida!");
        CartaDefesa defesa = new CartaDefesa("ESCUDO COLOSSAL", 50, "O escudo colossal protege a vida do jogador repondo a Mágia Dos Magos Mana em ação, protegendo assim sua própria vida!");

        System.out.println(cura.efeito());
    }
}
