package lista01.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variaveis
        double numero1;
        double numero2;
        double numero3;
        double maior = -99999.0;

        //pedindo ao usuario o numero 1
        System.out.println("Digite o numero 1: ");

        //recebendo o numero 1
        numero1 = leia.nextDouble();

        //pedindo ao usuario o numero 2
        System.out.println("Digite o numero 2: ");

        //recebendo o numero 2
        numero2 = leia.nextDouble();

        //pedindo ao usuario o numero 3
        System.out.println("Digite o numero 3: ");

        //recebendo o numero 3
        numero3 = leia.nextDouble();

        //testando e mostrando o resultado
        if(numero1 > maior){
            maior = numero1;
        }
        if(numero2 > maior){
            maior = numero2;
        }
        if(numero3 > maior){
            maior = numero3;
        }
        System.out.println("O maior numero e: " + maior);
    }
}
