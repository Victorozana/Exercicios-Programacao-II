package lista04.exercicio3;

import javax.swing.*;
import java.util.Locale;

public class Jogador {
    private String nome;
    private Double pontuacao;

    public Jogador(String nome, Double pontuacao) {
        this.nome = (!(nome.isEmpty()) && !eDigito(nome)) ? nome : null;
        this.pontuacao = (!pontuacao.describeConstable().isEmpty()) ? pontuacao : 0;
    }

    public String getNome() {
        return nome;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao){
        this.pontuacao = pontuacao;
    }

    /**
     * descobre se é digito ou não
     * @param nome digitado pelo usuário
     * @return retorna verdadeiro se for digito e falso se não for digito
     */
    private boolean eDigito(String nome){
        for (char numero : nome.toCharArray() ){
            if (Character.isDigit(numero)){
                    return true;
            }
        }
        return false;
    }

}
