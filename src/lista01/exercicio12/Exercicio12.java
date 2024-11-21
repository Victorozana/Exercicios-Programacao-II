package lista01.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        double numero1;
        double numero2;
        double maior = -99999.0;

        //pedindo para o usuario o numero 1
        System.out.println("Digite o numero 1: ");

        //recebendo os dados o numero 1
        numero1 = leia.nextDouble();

        //pedindo para o usuario o numero 2
        System.out.println("Digite o numero 2: ");

        //recebendo os dados o numero 2
        numero2 = leia.nextDouble();

        //realizando os testes
        if(numero1 > maior){
            maior = numero1;
        }
        if (numero2 > maior){
            maior = numero2;
        }

        //mostrando o resultado (maior numero)
        System.out.println("O maior numero e: " + maior);
    }

}
