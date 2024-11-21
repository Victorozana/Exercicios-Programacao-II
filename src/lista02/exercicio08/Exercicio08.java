package lista02.exercicio08;
import java.lang.Math;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        double raio = leiaRaio();

        double area = areaCirculo(raio);

        escrevaArea(area);
    }

    /**
     * função para mostrar a area total
     * @param area valor total da area do circulo
     */
    public static void escrevaArea(double area) {
        System.out.println("O valor do area e: " + area);
    }

    /**
     * função para ler o raio digitado pelo usuario
     * @return o raio digitado pelo usuario
     */
    public static double leiaRaio() {
        double raio;
        try (Scanner leia = new Scanner(System.in)){
        do {
            System.out.println("Digite o valor do raio(positivo): ");
            raio = leia.nextDouble();
            if (raio <= 0) {
                System.out.println("O valor precisa ser positivo.");
            }
        } while (raio <= 0);
    }
        return raio;
    }

    /**
     * função para calcular a area do circulo
     * @param raio valor digitado pelo usuario
     * @return o calculo total da area
     */
    public static double areaCirculo(double raio){
        return Math.pow(raio, 2) * Math.PI;
    }

}
