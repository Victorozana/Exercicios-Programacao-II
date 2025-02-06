package lista03.exercicio04;

import java.util.Arrays;

public class JogoDaVelha {
    private final String [][] gradeDoJogo;

    public JogoDaVelha(){
        gradeDoJogo = new String[3][3];
        inicializar();
    }

    private void inicializar(){
        for (String[] doJogo : gradeDoJogo) {
            Arrays.fill(doJogo, "  ");
        }
    }

    private String enumeracao(String jogada, String simbolo) {
        switch (jogada) {
            case "1" -> gradeDoJogo[0][0] = simbolo;
            case "2" -> gradeDoJogo[1][0] = simbolo;
            case "3" -> gradeDoJogo[2][0] = simbolo;
            case "4" -> gradeDoJogo[0][1] = simbolo;
            case "5" -> gradeDoJogo[1][1] = simbolo;
            case "6" -> gradeDoJogo[2][1] = simbolo;
            case "7" -> gradeDoJogo[0][2] = simbolo;
            case "8" -> gradeDoJogo[1][2] = simbolo;
            case "9" -> gradeDoJogo[2][2] = simbolo;
            default -> {
                return "Jogada inválida!";
            }
        }
        return  "";
    }

    public void exibirGrade(){
        for (int i = 0; i < gradeDoJogo.length; i ++){
            for (int j = 0; j < gradeDoJogo[i].length; j ++){
                System.out.print(gradeDoJogo[i][j]);
                if (j < gradeDoJogo[i].length - 1 ) System.out.print                                        ("|");
            }
            System.out.println();
            if (i < gradeDoJogo.length - 1) System.out.println("-----");
        }
    }


    public void verificarJogada(String jogada, String simbolo){
        System.out.println(enumeracao(jogada, simbolo));
        exibirGrade();
        System.out.println(vencedor());
    }

    private String vencedor(){
        //verificando se o jogador 1 venceu
        for (int i = 0; i < gradeDoJogo.length; i ++){
            for (int j = 0; j < gradeDoJogo.length; j ++){
               if (gradeDoJogo[0][0].equals("x") &&  gradeDoJogo[0][1].equals("x") && gradeDoJogo[0][2].equals("x")){
                   return "\nVencedor Jogador 1!";
               }
               }
        }

        //verificando se o jogador 2 venceu
        for (int i = 0; i < gradeDoJogo.length; i ++){
            for (int j = 0; j < gradeDoJogo.length; j ++){
                if (gradeDoJogo[0][0].equals("o") &&  gradeDoJogo[0][1].equals("o") && gradeDoJogo[0][2].equals("o")){
                    return "\nVencedor Jogador 2!";
                }
            }
        }
        return "\n Empate!";
    }
}
