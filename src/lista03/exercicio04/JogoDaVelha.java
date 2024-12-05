package lista03.exercicio04;

import java.lang.reflect.Array;
import java.util.Scanner;

public class JogoDaVelha {
    private String [][] gradeDoJogo;

    public JogoDaVelha(String [][] gradeDoJogo){
        this.gradeDoJogo = new String[3][3];
    }

    private String [][] enumeracao(String jogador, String simbolo) {
        switch (jogador) {
            case "1" -> {
                gradeDoJogo[0][0] = simbolo;
            }
            case "2" -> {
                gradeDoJogo[1][0] = simbolo;
            }
            case "3" -> {
                gradeDoJogo[2][0] = simbolo;
            }
            case "4" -> {
                gradeDoJogo[0][1] = simbolo;
            }
            case "5" -> {
                gradeDoJogo[1][1] = simbolo;
            }
            case "6" -> {
                gradeDoJogo[2][1] = simbolo;
            }
            case "7" -> {
                gradeDoJogo[0][2] = simbolo;
            }
            case "8" -> {
                gradeDoJogo[1][2] = simbolo;
            }
            case "9" -> {
                gradeDoJogo[2][2] = simbolo;
            }
            default -> {
                return "Jogada inválida!";
            }
        }
        return "Jogada registrada!";
    }

    public void exibirGrade(){
        for (int i = 0; i < gradeDoJogo.length; i ++){
            for (int j = 0; j < gradeDoJogo[i].length; j ++){
                System.out.print(gradeDoJogo[i][j]+" | ");
            }
            System.out.println();
        }
    }


    private boolean verificarJogada(String jogador1, String jogador2){

        if (jogador1.equals("1,2,3")){ return true;}
        if (jogador1.equals("4,5,6")){ return true;}
        if (jogador1.equals("7,8,9")){ return true;}
        if (jogador1.equals("1,5,9")){ return true;}
        if (jogador1.equals("3,5,7")){ return true;}
        //condições para o jogador 2 vencer
        if (jogador2.equals("1,2,3")){ return true;}
        if (jogador2.equals("4,5,6")){ return true;}
        if (jogador2.equals("7,8,9")){ return true;}
        if (jogador2.equals("1,5,9")){ return true;}
        if (jogador2.equals("3,5,7")){ return true;}

        return false;
    }


    public void jogar(String [][] gradeDoJogo, String jogador1, String jogador2){
        do {
            jogador1 = lerJogador1();
            jogador2 = lerJogador2();
            gradeDoJogo = enumeracao(jogador1, "x");
            gradeDoJogo = enumeracao(jogador2, "o");
        }while (!(verificarJogada(jogador1, jogador2)));


    }
}
