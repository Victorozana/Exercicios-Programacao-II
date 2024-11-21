package lista02.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = leia.nextDouble();

        System.out.println("Digite o expoente: ");
        double expoente = leia.nextDouble();

        double result = potencia(base, expoente);

        System.out.println("O resultado e: "+result);
    }

    /**
     * função para calcular a potencia
     * @param base digitado pelo usuario
     * @param expoente digitado pelo usuario
     * @return a potencia com a base dividido pelo numero do expoente
     */
    public static double potencia(double base, double expoente){
        if (expoente == 1){
            return base;
        } else if (expoente > 1) {
            return base * potencia(base, expoente - 1);
        } else {
            return 1 / potencia(base, - expoente);
        }
    }
}
