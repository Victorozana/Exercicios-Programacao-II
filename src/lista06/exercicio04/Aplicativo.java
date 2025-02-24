package lista06.exercicio04;

public class Aplicativo {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("QD 123, Lote 23", 2000.00);

        Novo novo = new Novo("QD 123, Lote 23", 2000.00, 2000.00);

        Velho velho = new Velho("QD 123, Lote 23", 2000.00, 1000.00);

        novo.valorComAdicional();

        velho.valorComDesconto();
    }


}
