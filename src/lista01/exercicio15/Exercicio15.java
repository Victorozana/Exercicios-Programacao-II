package lista01.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double lado1;
        double lado2;
        double lado3;

        //pedindo para o usuario o lado 1
        System.out.println("Digite o lado 1: ");

        //recebendo o lado 1
        lado1 = leia.nextDouble();

        //pedindo para o usuario o lado 2
        System.out.println("Digite o lado 2: ");

        //recebendo o lado 2
        lado2 = leia.nextDouble();

        //pedindo para o usuario o lado 3
        System.out.println("Digite o lado 3: ");

        //recebendo o lado 3
        lado3 = leia.nextDouble();

        //comparando os lados e mostrando os resultados
        if(lado1 == lado2 && lado1 == lado3){

            System.out.println("Tringulo Equilatero!");

        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){

            System.out.println("Tringulo Isosceles!");

        }else if(!(lado1 == lado2 && lado1 == lado3)){

            System.out.println("Tringulo Escaleno!");

        }
    }
}
