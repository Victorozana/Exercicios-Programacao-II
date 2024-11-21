package lista02.exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String string = leia.nextLine();

        int cont = contVogais(string);

        System.out.println(cont);

        leia.close();
    }

    /**
     * função para verificar se há uma vogal na string digitado pelo usuario
     * @param string é a palavra digitada pelo o usuário
     * @return retorna quantas vogais foram digitadas
     */
    public static int contVogais(String string) {
        int cont = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < string.length(); i++) {
            char caractere = string.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                cont++;
            }
        }
        return cont;
    }
}