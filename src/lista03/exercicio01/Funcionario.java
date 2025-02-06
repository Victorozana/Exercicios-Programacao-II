package lista03.exercicio01;

public class Funcionario {
    private String primeiroNome;
    private String sobreNome;
    private Double salarioMensal;

    public Funcionario(String primeiroNome, String sobreNome, Double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome(){
        return sobreNome;
    }

    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    public Double getSalarioMensal(){
        if (salarioMensal < 0){
            return 0.0;
        }
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    /**
     * método que calcula o salario anual. multiplicando o salario mensal 12 vezes;
     * @return retorna o salario mensal total
     */
    public Double calcularSalarioAnual(){
        return salarioMensal * 12;
    }

    /**
     * método usada para conceder aumento de 10% para a instância criada
     * @return o valor do salario anual somado aos 10% de aumento por mes cada mes
     */
    public Double aumento(){
        return  calcularSalarioAnual() * 0.10 + calcularSalarioAnual();
    }
}
