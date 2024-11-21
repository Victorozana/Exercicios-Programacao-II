package lista01.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        int numero1;
        int numero2;
        int quociente;
        int resto;

        //pedindo para o usuario o numero 1
        System.out.println("Digite o numero 1: ");

        //recebendo os dados o numero 1
        numero1 = leia.nextInt();

        //pedindo para o usuario o numero 2
        System.out.println("Digite o numero 2: ");

        //recebendo os dados o numero 2
        numero2 = leia.nextInt();

        //realizando os calculos
        quociente = numero1 / numero2;
        resto = numero1 % numero2;

        //mostrando o resultado
        System.out.println("O resto da divisao: " + resto);
        System.out.println("O quociente e: " + quociente);
    }

}
