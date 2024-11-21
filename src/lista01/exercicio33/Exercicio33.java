package lista01.exercicio33;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        double [] vetor = new double[20];
        double soma = 0;
        double media = 0;

        //utilizando for para percorrer os 20 elementos
        for (int i = 0; i < 20; i ++){

            //pedindo para o usuario fornecer os 20 elementos
            System.out.println("Digite o " +(i+1)+ "o vetor: " );

            //recebendo os 20 elementos
            vetor [i] = leia.nextDouble();

        }

        //somando os 20 elementos
        for (int i = 0; i < 20; i ++){

            soma = soma + vetor [i];

        }

        //obtendo a media
        media = soma / 20;

        //apresentando os resultados
        System.out.println("A media dos 20 elementos e: " +media);

    }
}
