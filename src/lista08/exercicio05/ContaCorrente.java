package lista08.exercicio05;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria implements IAtualizaSaldo, ITaxaOperacao{
    public ContaCorrente(Double saldo, String cliente) {
        super(saldo -= 15.0, cliente);
    }

    /**
     * se o valor for maior que 0 é habilidade (valor inteiro)
     * @param valor (inteiro)
     */
    @Override
    public void depositarDinheiro(Integer valor) {
        if (valor > 0.0)super.depositarDinheiro(valor);
    }

    @Override
    public void depositarCheque(Double valor) {
        if (valor > 0.0) super.depositarCheque(valor);
    }

    @Override
    public void sacar(Double valor) {
        if (getSaldo() > valor + calcularTaxaSaque()){
            super.sacar(valor + calcularTaxaSaque());
        }
    }

    /**
     * todo mês o saldo ganha 0.05% de rentabilidade no mês
     * @return o saldo total com a atualização mensal de 0.05% de rentabilidade
     */
    @Override
    public Double projetarSaldoMensal() {
        LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfMonth() == 1){
            super.setSaldo((getSaldo()*0.005));
            System.out.println("Saldo atualizado para: "+getSaldo());
        }else{
            System.out.println("Saldo não poderá ser atualizado!");
        }
        return super.getSaldo();
    }

    /**
     * @return a taxa fixa de saque == 0.10 centavos
     */
    @Override
    public Double calcularTaxaSaque() {
        return 0.10;
    }

    public String exibirInfor(){
        return "<<Conta Corrente>>"+
                "\nCliente: "+getCliente()+
                "\nSaldo: "+getSaldo();

    }
}
