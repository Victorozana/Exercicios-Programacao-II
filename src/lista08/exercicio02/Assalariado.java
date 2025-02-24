package lista08.exercicio02;

public class Assalariado extends Funcionario{
    private Double salarioMensal;

    public Assalariado(String nome, String cargo, Double salarioMensal){
        super(nome, cargo);
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public Double calcularTotalAPagar(){
        return salarioMensal;
    }
}
