package lista01.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        int numero;
        int fatorial;

        //pedindo ao usuario o numero
        System.out.println("Digite o numero: ");

        //recebendo o numero
        numero = leia.nextInt();

        //realizando o teste e mostrando o resultado
        for (int i = 1; i < numero; i++){
            if(numero % i == 0) {
                System.out.println(i);;
            }
        }
    }
}
