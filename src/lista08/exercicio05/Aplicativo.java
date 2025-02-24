package lista08.exercicio05;

public class Aplicativo {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100.00, "Victor Ozana da Silva Oliveira");
        ContaInvestimento contaInvestimento = new ContaInvestimento(100.00, "Victor Ozana");
        ContaPoupanca contaPoupanca = new ContaPoupanca(100.00, "Victor Ozana");

        contaInvestimento.sacar(20.00);
        contaCorrente.sacar(20.00);
        contaPoupanca.sacar(20.00);

        contaCorrente.depositarCheque(10.36);
        contaInvestimento.depositarCheque(10.36);
        contaPoupanca.depositarCheque(10.36);

        contaCorrente.depositarDinheiro(10);
        contaInvestimento.depositarDinheiro(10);
        contaPoupanca.depositarDinheiro(10);

        contaCorrente.projetarSaldoMensal();
        contaInvestimento.projetarSaldoMensal();
        contaPoupanca.projetarSaldoMensal();

        System.out.println(contaCorrente.exibirInfor());
        System.out.println(contaInvestimento.exibirInfo());
        System.out.println(contaPoupanca.exibirInfo());
    }
}
