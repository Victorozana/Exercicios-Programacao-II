package lista01.exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int [] vetor = new int[10];
        int soma = 0;

        //utilizando for para percorrer sobre os vetores
        for (int i = 0; i < 10; i ++) {

            //pedindo para o usuario digitar os vetores
            System.out.println("Digite o " + (i+1) + "o vetor: ");

            //recebendo a informação digitar os vetores
            vetor[i] = leia.nextInt();

        }

        //realizando a soma
        for (int i = 0; i < 10; i ++){

            soma = soma + vetor[i];

        }

        //apresentando os resultados
        System.out.println("A soma dos vetores e: " +soma);

    }
}
