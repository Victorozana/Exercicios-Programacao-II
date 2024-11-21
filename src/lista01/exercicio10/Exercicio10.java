package lista01.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    //declaração de variaveis
    double dolar;
    double real;
    double taxa_cambio;

    //pedindo para o usuario a quantidade de dolar
    System.out.println("Digite a quantidade de dolar: ");

    //recebendo os dados a quantidade de dolar
    dolar = leia.nextDouble();

    //pedindo para o usuario a taxa de cambio
    System.out.println("Digite a taxa de cambio: ");

    //recebendo os dados a taxa de cambio
    taxa_cambio = leia.nextDouble();

    //realizando os calculos
    real = (dolar * 5.61) + taxa_cambio;

    //mostrando o resultado
    System.out.println("O valor em real e: " + real);
}

}
