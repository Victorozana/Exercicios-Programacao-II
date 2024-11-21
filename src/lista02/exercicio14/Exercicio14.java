package lista02.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = leia.nextInt();

        int result = fatorial(numero);

        System.out.println(result);
        leia.close();
    }

    /**
     * função para calcular o fatorial de um numero
     *
     * @param numero numero digitado pelo usuario
     * @return
     */
    public static int fatorial(int numero) {
         if (numero == 0){
             return 1;
         }
         return numero * fatorial(numero - 1);
    }
}
