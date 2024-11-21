package lista01.exercicio25;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarando, testando e apresentando resultado
        for(int i = 1; i < 100; i ++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
