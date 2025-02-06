package lista03.exercicio03;

import jdk.swing.interop.SwingInterOpUtils;

public class Aplicativo {
    public static void main(String[] args) {
        Carro carro1 = new Carro(10.2, 5, "110");

        carro1.setVelocidadeMaxima(220);
        carro1.setVelocidadeAtual(80);
        carro1.acelerar();
        carro1.acelerar();
        carro1.freiar();
        carro1.exibirEstado();
    }
}
