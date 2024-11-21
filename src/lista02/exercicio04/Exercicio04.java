package lista02.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int [] numero = new int[2];

        for (int i = 0; i < numero.length; i ++){
            System.out.println("Digite o [" +(i+1)+ "] numero: " );
            numero [i] = leia.nextInt();
        }

     int maior = maiorNumero(numero);

        System.out.println("O maior numero e: "+maior);
    }


    /**
     * função para verificar qual é o maior número dentre os números digitados pelo usuário
     * @param numeros numeros digitado pelo usuário
     * @return retorna o maior número
     */
    public static int maiorNumero(int [] numeros) {

        int maior = -9999;

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}

