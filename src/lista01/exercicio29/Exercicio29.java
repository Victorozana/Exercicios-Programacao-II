package lista01.exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarar variaveis
        int numero_perfeito;
        int divisor = 0;

        //pedir ao usuario o numero
        System.out.println("Digite o numero: ");

        //receber o numero
        numero_perfeito = leia.nextInt();

        //fazer os calculos
        for (int i = 1; i < numero_perfeito; i ++){
            if(numero_perfeito % i == 0){
                divisor = divisor + i;
            }
        }

        //mostrando resultados
        if(divisor == numero_perfeito){
            System.out.println("Numero perfeito!");
        }else{
            System.out.println("Numero imperfeito!");
        }
    }
}
