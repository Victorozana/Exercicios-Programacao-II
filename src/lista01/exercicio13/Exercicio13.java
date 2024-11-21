package lista01.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double peso;
        double altura;
        double imc;

        //pedindo ao usuario o peso
        System.out.println("Digite seu peso em KG: ");

        //recebendo dado o peso
        peso = leia.nextDouble();

        //pedindo ao usuario a altura
        System.out.println("Digite sua altura em M^2: ");

        //recebendo dado a altura
        altura = leia.nextDouble();

        //realizando os calculos
        imc = peso / Math.pow(altura, 2.0);

        //fazendo os testes e mostrando o resultado
        if(imc < 18.5){

            System.out.println(" seu IMC: " +imc);

            System.out.println("Você está abaixo do peso ENGORDE!");

        }else if(imc > 18.5 && imc < 24.90){

            System.out.println(" seu IMC: " +imc);

            System.out.println("Você está com o peso normal PARABENS!");

        }else if(imc > 25.0){

            System.out.println(" seu IMC: " +imc);

            System.out.println("Você está acima do peso EMAGRECA!");
        }
    }
}
