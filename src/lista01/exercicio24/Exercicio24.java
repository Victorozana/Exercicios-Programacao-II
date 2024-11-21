package lista01.exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        int numero;
        int cont = 0;

        //pedindo ao usuario o numero
        System.out.println("Digite um numero: ");

        //recebendo o numero
        numero = leia.nextInt();

        //fazendo os testes e mostrando o resultado
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        if(cont < 2){
            System.out.println("Numero primo!");
        }
    }
}
