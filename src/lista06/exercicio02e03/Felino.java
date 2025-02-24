package lista06.exercicio02e03;

public class Felino extends Animal {
    public Felino(Double peso, Integer idade, String alimento, Double velocidade){
        super(peso, idade, alimento, velocidade);
    }

    public void ronronar(){
        System.out.println("Ronronando...");
    }
}
