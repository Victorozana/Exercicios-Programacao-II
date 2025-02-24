package lista08.exercicio01;

public class Aplicativo {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println("Soma de inteiros: "+soma.calcular(1, 2));
        System.out.println("Soma de decimais: "+soma.calcular(2.6, 2.5));
        System.out.println("Subtracao de inteiros: "+subtracao.calcular(2, 3));
        System.out.println("Multiplicacao: "+multiplicacao.calcular(6.5, 6.555));
        System.out.println("Divisao: "+divisao.calcular(64, 22));
        System.out.println("Divisao: "+divisao.calcular(6.66, 3.25));
    }
}
