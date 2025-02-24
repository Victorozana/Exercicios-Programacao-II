package lista06.exercicio05;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(12.0, LocalDate.of(2025, 5, 25), "Show de Teatro");
        Normal normal = new Normal(12.0, LocalDate.of(2025, 5,25), "Show de Teatro");
        Vip vip = new Vip(12.0, LocalDate.of(2025, 5, 25), "Show de Teatro", 5.0);
        CamaroteInferior camaroteInferior = new CamaroteInferior(12.0, LocalDate.of(2025, 5, 25), "Show de Teatro", 5.0, "Poltrona 12");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(12.0, LocalDate.of(2025, 5, 25), "Show de Teatro", 5.0, "Poltrona 21", 5.0);

        ingresso.imprimirDadosDoEvento();
        normal.imprimirIngressoNormal();
        vip.valorIngressoVip();
        System.out.println(camaroteInferior.getLocalizacao());
        camaroteSuperior.imprimirValorCamarote();
        System.out.println(camaroteSuperior.getLocalizacao());
    }
}
