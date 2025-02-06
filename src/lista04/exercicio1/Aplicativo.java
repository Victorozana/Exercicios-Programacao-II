package lista04.exercicio1;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {
        Produto produto1 = new Produto(3, "Sabonete", 2.99, LocalDate.of(2026,1,1), "006555514");

        System.out.println(produto1.toString());

        produto1.desconto();

        produto1.atualizaQuantidade(6);

        System.out.println(produto1.toString());
    }
}
