package lista04.exercicio4;

import lista04.exercicio2.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Sabonete de coco", "Dove", 5.99);
        Produto produto2 = new Produto(2, "Sabonete de citronela", "Nivea", 4.51);
        Produto produto3 = new Produto(3, "Água", "Hidrat", 1.98);

        ItemPedido itemPedido = new ItemPedido(produto1, 1);
        ItemPedido itemPedido1 = new ItemPedido(produto2, 1);

        List<ItemPedido> itens = new ArrayList<>();

        Cliente cliente = new Cliente("06891354161", "Victor");

        Pedido pedido = new Pedido(12, LocalDate.of(2025, 1, 27), cliente, itens);

        pedido.addItem(itemPedido);
        pedido.addItem(itemPedido1);

        pedido.calculaTotal();

        pedido.remItem(itemPedido);

        pedido.exibirQuantItens();

        pedido.resumoPedido();
    }
}
