package lista04.exercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2024, 9, 15);
        ContaBancaria contaBancaria1 = new ContaBancaria(11111, 120, "Corrente");
        List <ContaBancaria> contas = new ArrayList<>();
        Cliente cliente1 = new Cliente("Keliane Martins Amaral", "71749193167", data1, contas);

        cliente1.addConta(contaBancaria1);

        ContaBancaria contaBancaria2 = new ContaBancaria(1223, 132333, "Poupanca");

        cliente1.addConta(contaBancaria2);


        contaBancaria1.addSaldo(23558.6);

        System.out.println(cliente1.quanTotalDeContas());

        System.out.println(cliente1.exibirCliente());

        System.out.println(cliente1.exibirCliente());
    }
}
