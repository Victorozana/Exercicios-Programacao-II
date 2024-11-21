package lista02.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String palavra = leia.nextLine();

        if (stringPalindromo(palavra)){
            System.out.println("E palindromo!");
        }else {
            System.out.println("Nao e palindromo!");
        }
        leia.close();
    }

    /**
     * função usada para calcular se a String é palindromo
     * @param palavra digitado pelo usuario
     * @return retorna verdadeiro ou falso
     */
    public static boolean stringPalindromo(String palavra){
        return palavra.compareTo(stringReversa(palavra)) == 0;
    }

    /**
     * função usada para reverter a String palavra
     * @param palavra digitado pelo usuario
     * @return retorna a String reversa
     */
    public static String stringReversa(String palavra){
        if (palavra.isEmpty()){
            return palavra;
        }
       return stringReversa(palavra.substring(1)) + palavra.charAt(0);
    }
}
