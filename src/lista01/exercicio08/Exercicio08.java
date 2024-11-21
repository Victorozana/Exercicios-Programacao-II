package lista01.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        double base;
        double altura;
        double area;

        //pedindo para o usuario a altura
        System.out.println("Digite a altura: ");

        //recebendo os dados altura
        altura = leia.nextDouble();

        //pedindo para o usuario a base
        System.out.println("Digite a base: ");

        //recebendo os dados a base
        base = leia.nextDouble();

        //realizando os calculos
        area = base * altura;

        //mostrando o resultado
        System.out.println("Sua area e: " + area);
    }

}
