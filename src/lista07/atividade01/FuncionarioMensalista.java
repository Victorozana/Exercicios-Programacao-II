package lista07.atividade01;

public class FuncionarioMensalista extends Funcionario{
    private Double beneficios;

    public FuncionarioMensalista(String nome, String cpf, Double salarioBase, Double beneficios){
        super(nome, cpf, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    public Double calcularSalario(){
        return getSalarioBase() + beneficios;
    }
}
