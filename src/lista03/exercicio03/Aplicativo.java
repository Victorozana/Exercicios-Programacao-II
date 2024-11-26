package lista03.exercicio03;

import jdk.swing.interop.SwingInterOpUtils;

public class Aplicativo {
    public static void main(String[] args) {
        Carro carro1 = new Carro(10, 5, "220");

        carro1.setVelocidadeAtual(60);
        carro1.setVelocidadeMaxima(220);
        carro1.setAno(2018);
        carro1.setCor("Prata");
        carro1.setChassi("18452614875164875");
        carro1.setModelo("EcoSport");
        carro1.setMarca("Ford");
        carro1.setNumeroDePortas(4);
        carro1.setTetoSolar("Não");
        carro1.setProprietario("Victor Ozana");
        carro1.setVolumeDeCombustivel("10");
        carro1.setCambioAutomatico("Não");


        carro1.acelerar();
        System.out.println(carro1.trocarMarcha(1));
        carro1.acelerar();
        System.out.println(carro1.trocarMarcha(2));
        carro1.acelerar();
        System.out.println(carro1.trocarMarcha(6));

        carro1.exibirEstado();

        carro1.freiar();
        System.out.println(carro1.reduzMarcha(5));
        System.out.println(carro1.reduzMarcha(1));
        System.out.println(carro1.reduzMarcha(0));
        carro1.exibirEstado();
    }
}
