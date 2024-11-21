package lista03.exercicio01;

public class Funcionario {
    String primeiroNome;
    String sobreNome;
    Double salarioMensal;

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

    public Double calcularSalarioAnual(){
        return salarioMensal * 12;
    }
}
