package lista08.exercicio05;

import java.time.LocalDate;
import java.time.LocalTime;

public class ContaPoupanca extends ContaBancaria implements IAtualizaSaldo{
    public ContaPoupanca(Double saldo, String cliente) {
        super(saldo >= 0 ? saldo : 0.00, cliente);
    }


    @Override
    public void depositarCheque(Double valor) {
        if (valor > 0.0)super.depositarCheque(valor);
    }

    @Override
    public void depositarDinheiro(Integer valor) {
        if (valor > 0)super.depositarDinheiro(valor);
    }

    @Override
    public void sacar(Double valor) {
        if (valor > 0.0)super.sacar(valor);
    }

    /**
     * atualiz  o saldo mensal com 1% de rentabilidade
     * @return
     */
    @Override
    public Double projetarSaldoMensal() {
        LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfMonth() == 1){
             super.setSaldo((getSaldo()*0.01));
            System.out.println("Saldo atualizado para: "+getSaldo());
        }else{
            System.out.println("Saldo não poderá ser atualizado!");
        }
        return super.getSaldo();
    }

    public String exibirInfo(){
        return "<<Conta Poupança>>"+
                "\nCliente: "+getCliente()+
                "\nSaldo: "+getSaldo();

    }

}
