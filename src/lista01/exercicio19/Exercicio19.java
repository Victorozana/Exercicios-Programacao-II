package lista01.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double valor_produto;
        double percentual;
        double desconto;
        //pedindo ao usuario o valor do produto
        System.out.println("Digite o valor do produto: ");

        //recebendo o valor do produto
        valor_produto = leia.nextDouble();

        //pedindo ao usuario o percentual de desconto
        System.out.println("Digite o percentual de desconto: ");

        //recebendo o percentual de desconto
        percentual = leia.nextDouble();

        //fazendo os calculos
        desconto = (percentual / 100) * valor_produto;

        //mostrando o resultado
        System.out.println("O valor do desconto e: " + desconto);
    }
}
