package lista02.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = leia.nextInt();

        int soma = somaNumeros(n);

        System.out.println(soma);
    }

    /**
     * função para somar numeros de 1 a N
     * @param n numero digitado pelo usuario
     * @return retorna a soma de 1 a N
     */
    public static int somaNumeros(int n){
        if (n <= 0){
            return n;
        }
        return n + somaNumeros(n - 1);
    }
}
