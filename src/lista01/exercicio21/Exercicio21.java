package lista01.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            // declaração de variaveis
            int numero;

            // pedindo para o usuario as horas trabalhadas
            System.out.println("Digite o numero: ");

            // recebendo os dados horas trabalhadas
            numero = leia.nextInt();

            // realizando os calculos
            for (int i = 1; i < 11; i++) {

                System.out.println(numero + "x" + i + "=" + (numero * i));

            }
        }

    }
