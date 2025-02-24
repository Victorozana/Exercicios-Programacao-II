package lista06.exercicio02e03;

public class Cachorro extends Animal{

    public Cachorro(Double peso, Integer idade, String alimento, Double velocidade) {
        super(peso, idade, alimento, velocidade);
    }

    public void alimentar(){
        System.out.println("Alimento: "+getAlimento());
        System.out.println("Comendo...");
    }

    public void latir(){
        System.out.println("Latindo...");
    }
}
