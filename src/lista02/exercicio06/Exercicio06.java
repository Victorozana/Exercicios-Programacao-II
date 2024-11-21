package lista02.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [] numeros = new int[3];

        for (int i = 0; i < numeros.length; i ++){
            numeros[i] = leia.nextInt();
        }

       int media = mediaAritmetica(numeros);

        System.out.println(media);
    }

    /**
     * função para calcular a media entre 3 numeros
     * @param numeros numeros digitados pelo usuario
     * @return retorna a media aritmetica entre os 3 numeros
     */
    public static int mediaAritmetica(int [] numeros){
        int soma = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i ++) {
            soma += numeros[i];
        }

        media = soma / 3;

        return media;
    }
}
