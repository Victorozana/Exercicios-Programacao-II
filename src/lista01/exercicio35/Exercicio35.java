package lista01.exercicio35;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double [] vetor1 = new double[5];
        double [] vetor2 = new double[5];
        double multiplicacao = 0;

        //utilizando o for para percorrer os vetores 1 e 2
        for (int i = 0; i < 5; i ++){

            //pedindo para o usuario o 1 vetor
            System.out.println("Digite o " +(i+1)+ "o vetor da posicao 1:");

            //recebendo esses dados
            vetor1 [i] = leia.nextDouble();

            //pedindo para o usuario o 1 vetor
            System.out.println("Digite o " +(i+1)+ "o vetor da posicao 2");

            //recebendo esses dados
            vetor2 [i] = leia.nextDouble();
        }

        //utilizando o for para multiplicar os vetores de sua posicao respectiva
        for (int i = 0; i < 5; i ++){

            //multiplicando
            multiplicacao = vetor1[i] / vetor2[i];

            //apresentando resultados
            System.out.println("Valor total da multiplicacao dos " +(i+1)+ "o vetores: " +multiplicacao );

        }
    }
}
