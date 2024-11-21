package lista02.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        String string = leiaString();

        String invertida = inverterString(string);

        escrevaString(invertida);
    }

    /**
     * função para mostrar a String invertida
     * @param invertida a String invertida
     */
    public static void escrevaString(String invertida){
        System.out.println("A palavra invertida e: " +invertida);
    }

    /**
     * função para ler a String que será retornada
     * @return retorna a String digitado
     */
    public static String leiaString(){
        String string;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a palavra a ser invertida: ");
        string = leia.nextLine();
        
        leia.close();

        return string;
    }

    /**
     * função para inverter uma String de posição
     * @param string digitada pelo usuário
     * @return retorna a String invertida
     */
    public static String inverterString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
