package lista02.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os graus em celsius: ");
        double celsius = leia.nextDouble();

        double fahrenheit = conversaoTemperatura(celsius);

        System.out.print("O grau em fahrenheit e: " +fahrenheit);
    }

    /**
     * função para converter celsius para fahrenheit
     * @param celsius grau digitado pelo usuario
     * @return retorna o valor em fahrnheit
     */
    public static double conversaoTemperatura(double celsius){
        return (celsius * 1.8) + 32;
    }

}
