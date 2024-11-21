package lista02.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = leia.nextInt();

        int resultado = soma(numero1, numero2);

        System.out.println("O resultado da soma e: " +resultado);
    }

    /**
     *
     * @param a o primeiro numero inteiro digitado pelo usuario
     * @param b o segundo numero inteiro digitado pelo usuario
     * @return retorna a soma entre dois numeros inteiros
     */
    public static int soma(int a, int b){
        return a + b;
    }
}
