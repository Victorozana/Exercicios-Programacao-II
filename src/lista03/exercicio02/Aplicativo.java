package lista03.exercicio02;

import lista04.exercicio1.Produto;

import java.time.Period;

public class Aplicativo {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Eduarda", "7033308", "06891354161");

        System.out.println(proprietario1.toString());

        proprietario1.idadeAtual("2005-08-30");

     }
}
