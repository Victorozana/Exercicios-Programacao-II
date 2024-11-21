package lista01.exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando variavel
        int N;
        int TA = 0;
        int TB = 1;
        int TC = 1;

        //pedindo para o usuario o N
        System.out.println("Digite o numero N: ");

        //recebendo o numero N
        N = leia.nextInt();

        //calculando e mostrando resultado
        do{
            System.out.println(+TB);
            TA = TB;
            TB = TC;
            TC = TA + TB;
            N = N - 1;
        }while (N > 0);

    }
}
