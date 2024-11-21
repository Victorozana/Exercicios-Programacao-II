package lista01.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        int N;

        //pedindo o numero N
        System.out.println("Digite um numero: ");

        //recebendo o dado numero N
        N = leia.nextInt();

        //repetindo e calculando mostrando resultados
        for (int i = 1; i < N; i ++){
            System.out.println(i + N);
        }
    }
}
