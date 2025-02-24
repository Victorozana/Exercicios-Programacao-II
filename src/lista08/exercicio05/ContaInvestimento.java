package lista08.exercicio05;

import java.time.LocalDate;

public class ContaInvestimento extends ContaBancaria implements ITaxaOperacao, IAtualizaSaldo{
    public ContaInvestimento(Double saldo, String cliente){
        super(saldo >= 0 ? saldo : 0.00, cliente);
    }

    /**
     * se o valor for maior que 0 o deposito é validado
     * @param valor a ser depositado em dinheiro (valores sem centavos, apenas inteiros)
     */
    @Override
    public void depositarCheque(Double valor) {
        if (valor > 0.0) super.depositarCheque(valor);
    }

    /**
     * se o valor for maior que 0 o deposito é validado
     * @param valor a ser depositado em dinheiro (valores sem centavos, apenas inteiros)
     */
    @Override
    public void depositarDinheiro(Integer valor) {
        if (valor > 0) super.setSaldo(valor.doubleValue());
    }

    /**
     * se o valor de saque for maior que o saldo total da conta mais o ataxa sobre esse valor que será sacado, a transação é permitida
     * @param valor a ser sacado
     */
    @Override
    public void sacar(Double valor) {
        if (getSaldo() > (valor + (valor*calcularTaxaSaque()))){
            super.sacar(valor + ( valor * calcularTaxaSaque()));
        }
    }

    /**
     * projeta o saldo do mês incrementando a taxa selic, adotei como exemplo uma taxa de 13.24% ao ano dividido por 12 para mensurar o valor ganho no mês
     * @return o saldo total com o valor atualizado da taxa selic
     */
    @Override
    public Double projetarSaldoMensal() {
        LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfMonth() == 1){
            super.setSaldo(getSaldo()*0.0110416666666667);
            System.out.println("Saldo atualizado para: "+getSaldo());
        }else{
            System.out.println("Saldo não poderá ser atualizado!");
        }
        return super.getSaldo();
    }

    /**
     * @return a cada saque o cliente paga uma taxa de 0.38% sobre o valor de saque
     */
    @Override
    public Double calcularTaxaSaque() {
        return 0.0038;
    }

    public String exibirInfo(){
        return "<<Conta Investimento>>"+
                "\nCliente: "+getCliente()+
                "\nSaldo: "+getSaldo();

    }
}
