package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    //declaração de variaveis
        double raio;
        double area;

    //pedindo para o usuario o raio da circunferencia
        System.out.println("Digite o raio da circuferencia: ");

    //recebendo os dados
        raio = leia.nextInt();

    //realizando os calculos da area
        area = Math.pow(raio, 2.0) * 3.14;

    //mostrando o resultado
        System.out.println("A area do circulo e: " + area);
    }
}
