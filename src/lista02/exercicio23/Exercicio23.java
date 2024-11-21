package lista02.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String palavra = leia.nextLine();
        char caractere = 'a';

        int result = contCaractere(palavra, caractere, 0);

        System.out.println(result);

    }

    /**
     * função para contar a quantidade de um determinado caractere em uma String
     * @param palavra digitado pelo usuario
     * @param caractere digitado pelo usuario
     * @param indice repetição da String
     * @return rertona a quantidade de um determinado caractere em uma String
     */
    public static int contCaractere(String palavra, char caractere, int indice) {
        if (indice >= palavra.length())
            return 0;

        int cont = (palavra.charAt(indice) == caractere) ? 1 : 0;

        return cont + contCaractere(palavra, caractere, indice + 1);
    }
}