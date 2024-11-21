package lista01.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        int numero1;
        int numero2;

        //pedindo ao usuario numero 1
        System.out.println("Digite o numero 1: ");

        //recebendo o numero 1
        numero1 = leia.nextInt();

        //pedindo ao usuario numero 2
        System.out.println("Digite o numero 2: ");

        //recebendo o numero 2
        numero2 = leia.nextInt();

        //verificando e dando o resultado
        if(numero1 % numero2 == 0){

            System.out.println("O 1 numero e multiplo do 2");

        }else{

            System.out.println("O 1 numero nao e multiplo do 2");

        }
    }
}
