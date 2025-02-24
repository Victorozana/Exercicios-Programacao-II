package lista06.exercicio02e03;

public class Canino extends Animal{

    public Canino(Double peso, Integer idade, String alimento, Double velocidade){
        super(peso, idade, alimento, velocidade);
    }

    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
