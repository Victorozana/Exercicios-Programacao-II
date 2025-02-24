package lista08.exercicio01;

public class Subtracao implements IOperacaoAritmetica {
    public Subtracao(){}

    @Override
    public Double calcular(Double a, Double b){
        return a - b;
    }

    @Override
    public Integer calcular(Integer a, Integer b){
        return a - b;
    }
}
