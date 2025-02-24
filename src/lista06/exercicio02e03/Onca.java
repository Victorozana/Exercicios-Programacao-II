package lista06.exercicio02e03;

public class Onca extends Felino{
    public Onca(Double peso, Integer idade, String alimento, Double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    public void rosnar(){
        System.out.println("Rosnando...");
    }
}
