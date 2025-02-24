package lista06.exercicio02e03;

public class Gato extends Felino{
    private String raca;

    public Gato(Double peso, Integer idade, String alimento, Double velocidade) {
        super(peso, idade, alimento, velocidade);
    }


    public void miar(){
        System.out.println("Miando...");
    }
}
