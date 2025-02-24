package lista06.exercicio02e03;

public class Peixe extends Animal{
    private String caracteristica;


    public Peixe(Double peso, Integer idade, String alimento, Double velocidade, String caracteristica){
        super(peso, idade, alimento, velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosDoPeixe(){
        System.out.println("Peso: "+getPeso());
        System.out.println("Idade: "+getIdade());
        System.out.println("Alimento: "+getAlimento());
        System.out.println("Velocidade: "+getVelocidade());
        System.out.println("Caracteristicas: "+getCaracteristica());
    }
}
