package lista01.exercicio34;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        int [] vetor = new int[30];
        int cont = 0;

        //utilizando o for para percorrer os 30 elementos
        for (int i = 0; i < 30; i ++){

            //pedindo para o usuario os 30 elementos
            System.out.println("Digite o " +(i+1)+ "o vetor: ");

            //recebendo os 30 elementos
            vetor [i] = leia.nextInt();

            //realizando a contagem caso seja par
            if (vetor [i] % 2 == 0){
                cont++;
            }
        }

        //apresentando o resultado
        System.out.println(+cont+ " sao numeros pares!");

    }
}
