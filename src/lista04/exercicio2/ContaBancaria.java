package lista04.exercicio2;

public class ContaBancaria {
    private Integer numero;
    private Integer agencia;
    private String tipoDaConta;
    private Double saldo;

    public ContaBancaria(Integer agencia, Integer numero, String tipoDaConta) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipoDaConta = tipoDaConta;
        this.saldo = 0.00;
    }

    /**
     * adiciona saldo a conta
     * @param valor saldo a ser inserido
     * @return
     */
    public Double addSaldo(Double valor){
        return saldo + valor;
    }

    /**
     * retira saldo da conta ou seja, saca o valor inserido
     * @param valor valor a ser retirado
     * @return
     */
    public Double remSaldo(Double valor){
        return saldo - valor;
    }

    /**
     * @return retorna o saldo final para o usuário
     */
    public Double getSaldo(){
        return saldo;
    }

}
