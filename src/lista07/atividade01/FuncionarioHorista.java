package lista07.atividade01;

public class FuncionarioHorista extends Funcionario{
    private int horasTrabalhadas;
    private Double valorHora;

    public FuncionarioHorista(String nome, String cpf, Double salarioBase, int horasTrabalhadas, Double valorHora){
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario(){
        return horasTrabalhadas * valorHora;
    }
}
