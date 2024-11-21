package lista01.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        double numero;

        //pedindo ao usuario o numero
        System.out.println("Digite o numero: ");

        //recebendo o dado numero
        numero = leia.nextDouble();

        //testando e determinando se e positivo negativo ou zero
        if(numero > 0){

            System.out.println("O numero e Positivo!");

        }else if(numero < 0){

            System.out.println("O numero e Negativo!");

        }else if(numero == 0){

            System.out.println("O numero e Zero!");

        }
}
}
