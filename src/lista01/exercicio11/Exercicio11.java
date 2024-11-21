package lista01.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    //declaração de variaveis
    int numero;

    //pedindo para o usuario o numero
    System.out.println("Digite um numero: ");

    //recebendo os dados o numero
    numero = leia.nextInt();

    //realizando os testes e mostrando o resultado respectivo
    if(numero % 2 == 0){
        System.out.println("Numero par");
    }else{
        System.out.println("Numero impar");
    }
}
}
