package lista01.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        int ano;

        //pedindo o ano ao usuario
        System.out.println("Digite o ano: ");

        //recebendo o dado ano
        ano = leia.nextInt();

        //realizando o teste e mostrando o resultado
        if(ano % 400 == 0){

            System.out.println("Ano Bissexto");

        }else if(ano % 4 == 0 && ano % 100 != 0 ){

            System.out.println("Ano Bissexto");

        }else{

            System.out.println("Esse ano nao e Bissexto");

        }
    }
}
