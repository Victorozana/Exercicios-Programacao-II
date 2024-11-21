package lista01.exercicio38;

import java.util.Scanner;

public class Exericicio38 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando varioaveis
        int [][] matriz = new int[4][4];
        int soma = 0;

        //utilizando for para percorrer as matrizes
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++) {

                System.out.println("Digite o [" + (i + 1) + "][" + (j + 1)+ "]: ");
                matriz [i][j] = leia.nextInt();

            }
        }

        //fazer a soma dos elementos da diogonal
        for (int i = 0; i < 4; i ++){
                soma += matriz [i][i];
        }

        //apresentar os resultados
        System.out.println("Soma dos elementos da diagonal principal: " + soma);

    }

}

