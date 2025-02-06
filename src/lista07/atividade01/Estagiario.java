package lista07.atividade01;

public class Estagiario extends Funcionario{
    private Integer cargaHoraria;
    private Double valorBolsa;

    public Estagiario(String nome, String cpf, Double salarioBase, Integer cargaHoraria, Double valorBolsa){
        super(nome, cpf, salarioBase);
        this.cargaHoraria = cargaHoraria;
        this.valorBolsa = valorBolsa;
    }

    @Override
    public Double calcularSalario(){
        return valorBolsa * cargaHoraria;
    }
}
