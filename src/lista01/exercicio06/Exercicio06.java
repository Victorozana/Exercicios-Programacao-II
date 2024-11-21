package lista01.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        double horas_trabalhadas;
        double salario_hora;
        double salario_total;

        //pedindo para o usuario as horas trabalhadas
        System.out.println("Digite as horas trabalhas: ");

        //recebendo os dados horas trabalhadas
        horas_trabalhadas = leia.nextDouble();

        //pedindo para o usuario o salario por hora
        System.out.println("Digite o salario por hora: ");

        //recebendo os dados do salario por hora
        salario_hora= leia.nextDouble();

        //realizando os calculos
        salario_total = salario_hora * horas_trabalhadas;

        //mostrando o resultado
        System.out.println("Seu salario e: " + salario_total);
        leia.close();
    }
}
