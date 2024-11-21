package lista01.exercicio40;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int [] vetor = new int[10];

        //for para receber os elementos do vetor
        for (int i = 0; i < 10; i ++){

            System.out.println("Digite o [" +(i+1)+ "] elemento: ");

            vetor[i] = leia.nextInt();

        }

        for (int i = 0; i < vetor.length / 2; i ++){

            int valor_temporario = vetor[i];

            vetor[i] = vetor[vetor.length - 1 - i];

            vetor[vetor.length - 1 - i] = valor_temporario;

        }

        //apresentando o resultado apos a troca
        System.out.println("\nVetor após a troca:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
