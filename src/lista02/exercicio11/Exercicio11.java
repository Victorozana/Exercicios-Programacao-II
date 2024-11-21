package lista02.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args){
        int numero = leiaNumero();

        int result = quadradoNumero(numero);

        escrevaResultado(result);
    }

    /**
     * função para apresentar o resultado
     * @param result resultado da equação
     */
    public static void escrevaResultado(int result){
        System.out.println("O quadrado do numero e: "+ result);
    }

    /**
     * função para ler o numero digitado pelo usuario
     * @return retorna o numero digitado pelo usuario
     */
    public static int leiaNumero(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = leia.nextInt();

        return numero;
    }

    /**
     * função para calcular o quadrado de um numero
     * @param numero numero digitado pelo usuario
     * @return retorna o quadrado do numero digitado
     */
    public static int quadradoNumero(int numero){
        return numero * numero;
    }

}
