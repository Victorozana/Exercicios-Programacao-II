package lista01.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int N;
        int soma = 0;

        //pedindo para o usuario digitar
        System.out.println("Digite o numero: ");

        //recebendo do usuario
        N = leia.nextInt();

        //fazendo os calculos e apresentando
        for (int i = 1; i < N; i ++){
            if( i % 2 == 0){
                soma = soma + i;
            }
        }
        System.out.println("A soma e: " +soma);
    }
}
