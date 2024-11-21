package lista02.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String palavra = leia.nextLine();

        String result = reverterString(palavra);

        System.out.println(result);
    }

    public static String reverterString(String palavra){
        if (palavra.isEmpty()){
            return palavra;
        }
        return reverterString(palavra.substring(1)) + palavra.charAt(0  );
    }
}
