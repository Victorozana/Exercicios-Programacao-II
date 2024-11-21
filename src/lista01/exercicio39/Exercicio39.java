package lista01.exercicio39;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //lendo as variaveis
        int [][] matriz = new int[2][2];
        int multiplicacao = 1;

        //utilizando for para percorrer a variavel
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 2; j ++){

                System.out.println("Digite a matriz [" +(i+1)+ "][" +(j+1)+ "]: ");
                matriz [i][j] = leia.nextInt();

            }
        }

        //for para realizar a multiplicacao e apresentar os resultados
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 2; j ++) {

                 multiplicacao *= matriz[i][j];

            }
        }

        //resultado das multplicacões das matrizes
        System.out.println("O resultado e: " +multiplicacao);
    }
}

