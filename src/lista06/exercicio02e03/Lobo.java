package lista06.exercicio02e03;

public class Lobo extends Animal{
    public Lobo(Double peso, Integer idade, String alimento, Double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    public void uivar(){
        System.out.println("Uivando...");
    }
}
