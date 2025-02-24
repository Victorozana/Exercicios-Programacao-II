package lista08.exercicio01;

public class Soma implements IOperacaoAritmetica {
    public Soma(){};

    @Override
    public Double calcular(Double a, Double b){
        return a + b;
    }

    @Override
    public Integer calcular(Integer a, Integer b){
        return a + b;
    }
}
