package lista02.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = leia.nextInt();

        escrevaParOuImpar(numero);
    }

    /**
     *
     * @param numero numero digitado pelo o usuario para verificar se e par ou impar
     */
    public static void escrevaParOuImpar(int numero){
        if (ePar(numero)){
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
    }

    /**
     *
     * @param numero numero digitado pelo o usuario para verificar se e par ou impar
     * @return retorna se e par ou impar
     */
    public static boolean ePar(int numero){
        return (numero % 2) == 0;
    }
}
