package lista02.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);

        double x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        x1 = leia.nextDouble();
        y1 = leia.nextDouble();
        x2 = leia.nextDouble();
        y2 = leia.nextDouble();

        double result = distanciaEuclidiana(x1, y1, x2, y2);

        System.out.println(result);

    }

    /**
     * função para calcular a distancia euclidiana de pontos distintos
     * @param x1 primeiro ponto dado pelo usuário
     * @param y1 segundo ponto dado pelo usuário
     * @param x2 terceiro ponto dado pelo usuário
     * @param y2 quarto ponto dado pelo usuário
     * @return retorna a distancia euclidiana
     */
    public static double distanciaEuclidiana(double x1, double y1, double x2, double y2){
        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return result;
    }
}
