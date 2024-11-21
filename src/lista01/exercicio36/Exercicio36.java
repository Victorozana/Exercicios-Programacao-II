package lista01.exercicio36;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int [][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        //utilizando for para percorrer os valores
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                //pedindo para o usuario digitar os valores da matriz
                System.out.println("Elemento [" +(i+1)+ "][" +(j+1)+ "]: " );

                //recebendo os valores da matriz
                matriz[i][j] = leia.nextInt();

                //soma dos elementos
                soma += matriz[i][j];
            }
        }

        //apresentando resultado
        System.out.println("Resultado: " +soma);
        leia.close();
    }
}
