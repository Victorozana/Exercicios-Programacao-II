package lista01.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        int anos;
        int dias;

        //pedindo para o usuario a idade
        System.out.println("Digite sua idade em anos: ");

        //recebendo os dados a idade
        anos = leia.nextInt();

        //realizando os calculos
        dias = anos * 365;

        //mostrando o resultado
        System.out.println("Sua idade em dias: " + dias);
    }


}
