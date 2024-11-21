package lista01.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        int idade;

        //pedindo o dado idade
        System.out.println("Digite a idade: ");

        //recebendo a idade
        idade = leia.nextInt();

        //testando e mostrando resultado
        if(idade > 0 && idade < 16){

            System.out.println("Nao esta apto a votar");

        } else if (idade > 0 && idade > 16 || idade == 16) {

            System.out.println("Apto a votar");

        }
    }
}
