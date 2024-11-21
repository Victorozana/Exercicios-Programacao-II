package lista01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    //declarando variaveis
    double celsius;
    double fahrenheit;

    //pedindo ao usuario
    System.out.println("Digite a temperatura em celsius: ");

    //recebendo a informacao
    celsius = leia.nextDouble();

    //realizando os calculos
    fahrenheit = (celsius * 1.8) + 32;

    //apresentando resultado
        System.out.println("O grau em fahrenheit e: " + fahrenheit);
    }
}
