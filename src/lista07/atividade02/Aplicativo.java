package lista07.atividade02;

public class Aplicativo {
    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        Calca calca = new Calca("Calca bege", 10.0, "P", "Jeans");
        Sapato sapato = new Sapato("Sapatenis", 20.0, "Couro", 37);
        Camiseta camiseta = new Camiseta("Camiseta Social", 55.0, "G", "Gola Polo");

        carrinhoCompra.addProduto(calca);
        carrinhoCompra.addProduto(sapato);
        carrinhoCompra.addProduto(camiseta);

        camiseta.desconto(5);

        System.out.println("Total: "+carrinhoCompra.calcularTotal());
    }
}
