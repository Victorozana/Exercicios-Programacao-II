package lista02.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os numeros: ");
        int numero = leia.nextInt();

        int result = contDigito(numero);

        System.out.println("A quantidade de digitos e: "+result);
    }

    /**
     * função para calcular quantos digitos possui um numero
     * @param numero numero digitado pelo usuario
     * @return retorna a quantidade de digitos
     */
    public static int contDigito(int numero) {
       if (numero < 10){
           return 1;
       }
       return 1 + contDigito(numero / 10);
    }
}