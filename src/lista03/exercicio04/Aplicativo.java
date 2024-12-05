package lista03.exercicio04;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        String [][] gradeJogo1 = new String[3][3];

        JogoDaVelha jogo1 = new JogoDaVelha(gradeJogo1);

        jogo1.jogar(gradeJogo1, "x", "o");


    }
}
