package lista04.exercicio4;

import lista04.exercicio2.Cliente;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Integer numero;
    private LocalDate data;
    private List<ItemPedido> itens;
    private Cliente cliente;

    public Pedido(Integer numero, LocalDate data, Cliente cliente){
        this.numero = (numero > 1) ? numero : null;
        this.data = data;
        this.cliente = cliente;
    }

    public Pedido(Integer numero, LocalDate data, Cliente cliente, List<ItemPedido> itens){
        this(numero, data, cliente);
        this.itens = itens;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * adiciona o item inserido
     * @param item item inserido
     * @return
     */
    public List<ItemPedido> addItem(ItemPedido item){
        itens.add(item);
        return itens;
    }

    /**
     * remova o item inserido
     * @param item item inserido
     * @return
     */
    public List<ItemPedido> remItem(ItemPedido item){
        itens.remove(item);
        return itens;
    }

    /**
     * @return calcula o total e retorna o total da compra
     * */
    public Double calculaTotal(){
        Double total = 0.0;
        for (ItemPedido pedidos : itens){
            System.out.println("Item: "+pedidos.getProduto().getNome());
            total += pedidos.getProduto().getPreco();
        }
        return total;
    }

    /**
     * exibe a quantidade de itens que tem no pedido
     */
    public void exibirQuantItens(){
        System.out.println("Quantidade de itens: "+itens.size());
    }

    /**
     * descobre se o pedido está vazio, não tem nenhum item
     * @param itens
     */
    public void eVazio(List<ItemPedido> itens){
        if (itens.isEmpty()){
            System.out.println("Pedido vazio!");
        }else{
            System.out.println("Pedido contém itens!");
        }
    }

    /**
     * demonstra um resumo do pedido
     */
    public void resumoPedido(){
        System.out.println("Pedido Nº: "+getNumero());
        for (ItemPedido pedidos : itens){
            System.out.println("Item: "+pedidos.getProduto().getNome());
        }
        System.out.println("Valor total: "+calculaTotal());
    }
}
