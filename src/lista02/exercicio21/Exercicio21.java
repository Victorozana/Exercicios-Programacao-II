package lista02.exercicio21;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio21 {

public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite a quantidade de elementos do vetor: ");
    int tamanho = leia.nextInt();

    int [] vetor = new int[tamanho];

    for (int i = 0; i < vetor.length; i ++){
        vetor[i] = leia.nextInt();
    }

    int result = somaVetor(vetor, 0);

    System.out.println(result);
}

    /**
     * função recursiva que retorna o soma de dois vetores
     * @param vetor que o usuario digita
     * @param indice que percorre os vetores
     * @return retorna a soma dos seus elementos
     */
    public static int somaVetor(int [] vetor, int indice){
        if (indice >= vetor.length){
            return 0;
        }
        return vetor[indice] + somaVetor(vetor, indice + 1);
    }
}
