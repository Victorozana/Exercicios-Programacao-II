package lista01.exercicio32;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double[] vetor = new double[15];
        double maior = -99999.0;
        double menor = 99999.0;

        //utilizando for para percorrer os vetores
        for (int i = 0; i < 15; i++) {

            //pedindo ao usuario o valor dos vetores
            System.out.println("Digite o valor do " + (i + 1) + "o vetor: ");

            //recebendo o valor
            vetor[i] = leia.nextDouble();

            //verificando os vetores para introduzir o maior
            if (vetor[i] > maior) {

                //armazenando o valor
                maior = vetor[i];

            }

            //verificando os vetores para introduzir o menor
            if (vetor[i] < menor) {

                //armazenando o valor
                menor = vetor[i];

            }
        }

        //mostrando os resultados
        System.out.println("O maior e: " +maior);

        System.out.println("O menor e: " +menor);

    }
}