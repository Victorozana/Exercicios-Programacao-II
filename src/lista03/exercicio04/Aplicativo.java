package lista03.exercicio04;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.exibirGrade();

        jogo.verificarJogada("1", "x");
        jogo.verificarJogada("2", "x");
        jogo.verificarJogada("3", "x");
        jogo.verificarJogada("4", "x");
        jogo.verificarJogada("5", "x");
        jogo.verificarJogada("6", "x");
        jogo.verificarJogada("7", "x");
        jogo.verificarJogada("8", "x");
        jogo.verificarJogada("9", "x");
    }
}
