package lista01.exercicio30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando as variaveis
        double base = 0;
        double expoente;
        double base_atual = 1;

        //pedindo ao usuario a base
        System.out.println("Digite a base: ");

        //recebendo do usario a base
        base = leia.nextDouble();

        //pedindo ao usuario o expoente
        System.out.println("Digite o expoente: ");

        //recebendo do usario o expoente
        expoente = leia.nextDouble();

        //fazendo os calculos
        for (int i = 0; i < expoente; i ++){
            base_atual = base_atual * base;
        }
        System.out.println("O resultado e: " + base_atual);
    }
}
