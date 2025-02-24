package lista04.exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();

        Jogo jogo = new Jogo("Voleiboll", LocalDate.of(2025, 1, 23), jogadores);

        Jogador jogador1 = new Jogador("Victor", 10.25);
        Jogador jogador2 = new Jogador("Keliane", 15.0);
        Jogador jogador3 = new Jogador("Nubia", 18.0);
        Jogador jogador4 = new Jogador("Rosimar", 19.0);

        jogo.addJogador(jogador1);
        jogo.addJogador(jogador2);
        jogo.addJogador(jogador3);
        jogo.addJogador(jogador4);

        System.out.println(jogo.pontuacaoMedia());
        System.out.println(jogo.vencedor());
        jogo.exibirClassificacao();

        jogo.reiniciarJogo();

        jogo.exibirPontuacao();

        jogador1.setPontuacao(12.55);

        jogo.exibirPontuacao();
    }
}
