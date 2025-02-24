package lista06.exercicio01;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("06891354161", "Luziania","Victor", LocalDate.of(2005, 8, 30), "Masculino");
        Profissional profissional = new Profissional(5410, "CEO", "Renato", LocalDate.of(1998, 7, 21), "Masculino");

        System.out.printf(cliente.exibirDadosDoCliente());
        System.out.println(profissional.exibirDadosProfissionais());
    }
}
