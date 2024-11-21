package lista03.exercicio02;

public class Teste {
    public static void main(String[] args) {
        Proprietario p = new Proprietario("victor", "068913","7033308", "61986462083", "Herculano Meireles", "Dalva I", "Luziania", "Goias", "72820350", "QD 125");



        /*
        p.setNome("Victor Ozana da Silva Oliveira");
        p.setCpf("06891354161");
        p.setRg("7033308");
        p.setTelefone("61986462083");
        p.setRua("Herculano Meireles");
        p.set("Pq Dalva I");
        p.setCidade("Luziania");
        p.setEstado("Goias");
        p.setCep("72820350");
        p.setComplemento("QD 125 LT 05");
*/

        p.mostrarEstado();

        p.setCpf("06891342155");

        p.mostrarEstado();
    }
}
