package lista08.exercicio02;

public class Horista extends Funcionario{
    private Double valorDaHoraTrabalhada;
    private Integer totalEmHorasTrabalhadas;

    public Horista(String nome, String cargo, Double valorDaHoraTrabalhada, Integer totalEmHorasTrabalhadas){
        super(nome, cargo);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.totalEmHorasTrabalhadas = totalEmHorasTrabalhadas;
    }

    public Double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    public Integer getTotalEmHorasTrabalhadas() {
        return totalEmHorasTrabalhadas;
    }

    @Override
    public Double calcularTotalAPagar() {
        return valorDaHoraTrabalhada * totalEmHorasTrabalhadas;
    }
}
