package lista01.exercicio37;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int [][] matriz = new int [3][3];

        //utilizando for para percorrer a matriz
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++) {

                //pedindo ao usuario que digite a matriz
                System.out.println("Digite [" +(i+1)+ "][" +(j+1)+ "]: " );

                //recebendo a matriz
                matriz [i][j] = leia.nextInt();
            }
        }

        //utilizando for para mostrar a matriz contraposta
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){

                System.out.println(matriz[j][i]+" ");

            }
            System.out.println();
        }

        leia.close();
    }
}
