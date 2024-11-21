package lista02.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor > 0: ");
        int n = leia.nextInt();

        int result = fibonacci(n);

        System.out.println("O resulta e: "+result);
    }

    /**
     * função para calcular a sequência de fibonacci
     * @param n numero digitado pelo usuario
     * @return retorna a sequencia
     */
    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
