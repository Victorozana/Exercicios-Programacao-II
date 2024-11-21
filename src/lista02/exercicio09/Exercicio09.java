package lista02.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        double[] baseAltura = leiaBaseAltura();
        double base = baseAltura[0];
        double altura = baseAltura[1];

        double area = areaRetangulo(base, altura);

        escrevaArea(area);

    }

    /**
     * função para mostrar a area total do retangulo
     * @param area valor total da area (resultado)
     */
    public static void escrevaArea(double area){
        System.out.println("A area do retangulo é: " +area);
    }

    /**
     * função que ler a base e a altura
     * @return retorna a base e a altura digitada
     */
    public static double[] leiaBaseAltura(){
        double base;
        double altura;

        try (Scanner leia = new Scanner(System.in)){
            do{
                System.out.println("Digite o valor da base(positivo): ");
                base = leia.nextDouble();
                System.out.println("Digtie o valor da altura(positivo): ");
                altura = leia.nextDouble();
                if (base <= 0 || altura <= 0){
                    System.out.println("Digite um valor positivo.");
                }
            }while (base <= 0 || altura <= 0);
        }

        return new double[]{base, altura};
    }

    /**
     * função para calcular a area do retangulo
     * @param base digitado pelo usuario
     * @param altura digitado pelo usário
     * @return retorna a area total do retangulo
     */
    public static double areaRetangulo(double base, double altura){
        return base * altura;
    }
}
