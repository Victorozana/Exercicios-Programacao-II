package lista01.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        //pedindo ao usuario os valores
        System.out.println("Digite a nota 1: ");

        //lendo a nota 1
        nota1 = leia.nextDouble();

        //pedindo ao usuario os valores
        System.out.println("Digite a nota 2: ");

        //lendo a nota 2
        nota2 = leia.nextDouble();

        //pedindo ao usuario os valores
        System.out.println("Digite a nota 3: ");

        //lendo a nota 3
        nota3 = leia.nextDouble();

        //pedindo ao usuario os valores
        System.out.println("Digite a nota 4: ");

        //lendo a nota 4
        nota4 = leia.nextDouble();

        //somando os valores
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //apresentando os valores
        System.out.println("A media dos valores e: " + media);
    }
}
