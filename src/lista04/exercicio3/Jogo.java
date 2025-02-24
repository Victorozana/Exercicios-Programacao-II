// Starting Java function implementation
package lista04.exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private String nome;
    private LocalDate data;
    private List<Jogador> jogadores;

    public Jogo(String nome, LocalDate data){
        this.nome = (!nome.isEmpty()) ? nome : null;
        this.data = data;
    }

    public Jogo(String nome, LocalDate data, List<Jogador> jogadores){
        this(nome, data);
        this.jogadores = jogadores;
    }

    public List<Jogador> addJogador(Jogador jogador){
        jogadores.add(jogador);
        return jogadores;
    }

    public Double pontuacaoMedia(){
        Double soma = 0.0;
        for (Jogador jogador : jogadores){
            soma = jogador.getPontuacao() + soma;
        }
        return soma / jogadores.size();
    }

    public String vencedor(){
        Double maior =  0.0;
        String nomeVencedor = "";
        for (Jogador jogador : jogadores){
            if (jogador.getPontuacao() > maior) {
                maior = jogador.getPontuacao();
                nomeVencedor = jogador.getNome();
            }
        }
        return nomeVencedor;
    }

    /**
     * exibe a classificação dos jogadores
     */
    public void exibirClassificacao(){
        jogadores.sort((j1, j2) -> Double.compare(j2.getPontuacao(), j1.getPontuacao()));

        System.out.println("Classificação dos Jogadores:");
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            System.out.println((i + 1) + "º - " + jogador.getNome() + " (" + jogador.getPontuacao() + " pontos)");
        }
    }

    /**
     * exibi a pontuação
     */
    public void exibirPontuacao() {
        for (Jogador jogador : jogadores){
            System.out.println("Jogador: "+jogador.getNome()+" Pontos - "+jogador.getPontuacao() );
        }
    }

    /**
     * reinicia as pontuações dos jogadores para que seja inseridas novamente
     */
    public void reiniciarJogo(){
        for (Jogador jogador : jogadores){
            jogador.setPontuacao(0.0);
        }
    }
}
