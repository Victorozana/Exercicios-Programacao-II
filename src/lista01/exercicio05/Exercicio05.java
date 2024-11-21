package lista01.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //leitura das variaveis
        double horas;
        double segundos;
        double minutos;

        //pedindo ao usuario a quantidade de horas
        System.out.println("Digite quantas horas deseja converter: ");

        //recebendo o dado (HORAS)
        horas = leia.nextInt();

        //convertendo os valores
        segundos = horas * 3600.0;
        minutos = horas * 60.0;

        //mostrando os valores
        System.out.println("Em minutos e: " +minutos);
        System.out.println("Em segundos e: " +segundos);
    }
}
