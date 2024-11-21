package lista02.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leia.nextInt();

        int resultado = 0;
        resultado = fatorial(numero);

        escrevaNumero(resultado);

        leia.close();
    }

    /**
     *
     * @param resultado apresenta o resultado da fatoração
     */
    public static void escrevaNumero(int resultado){
        System.out.println("O fatorial e: " +resultado);
    }

    /**
     *
     * @param numero numero inteiro digitado pelo usuario para verificar
     * @return o fatorial do numero digitado pelo usuario
     */
    public static int fatorial(int numero){
        if (numero == 0){
           return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
