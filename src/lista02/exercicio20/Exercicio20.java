package lista02.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = leia.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = leia.nextInt();

        int result = mdc(a, b);

        System.out.println(result);
    }

    /**
     * função para calcular o mdc de dois numeros
     * @param a numero digitado pelo usuario
     * @param b numero digitado pelo usuario
     * @return retorna o mdc desses dois numeros
     */
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }
}
