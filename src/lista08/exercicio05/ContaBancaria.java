package lista08.exercicio05;

public abstract class ContaBancaria {
    private Double saldo;
    private String cliente;

    public ContaBancaria(Double saldo, String cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo += saldo;
    }

    public void depositarCheque(Double valor){
        this.saldo += valor;
    }

    public void depositarDinheiro(Integer valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= (saldo > valor) ?  valor : null;
    }


}
