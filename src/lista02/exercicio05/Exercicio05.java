package lista02.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int number = leia.nextInt();

        if (numeroPrimo(number)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }


        leia.close();
    }

    /**
     * função para determinar se o numero e primo ou não
     * @param number numero que será verificado
     * @return retorna true para verdadeiro ou false para falso
     */
    public static boolean numeroPrimo(int number){
        if (number == 2){
        return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
