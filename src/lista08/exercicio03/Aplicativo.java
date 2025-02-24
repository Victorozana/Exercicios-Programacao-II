package lista08.exercicio03;

public class Aplicativo {
    public static void main(String[] args) {
        Roupa roupa = new Roupa("Polo", 125.50, "Camiseta");
        Eletronico eletronico = new Eletronico("Carregador type C", 12.90, "Carregador de Android");
        Livro livro = new Livro("Coleção do Harry Potter", 55.90, "Harry Potter Livros");

        roupa.exibirDetalhes();

        eletronico.calcularDesconto();
        eletronico.exibirDetalhes();

        livro.definirDesconto(10.0);
        livro.calcularDesconto();
        livro.exibirDetalhes();


    }
}
