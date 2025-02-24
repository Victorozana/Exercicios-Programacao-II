package lista06.exercicio02e03;

public class Animal {
    private Double peso;
    private Integer idade;
    private String alimento;
    private Double velocidade;

    public Animal(Double peso, Integer idade, String alimento, Double velocidade) {
        this.peso = peso;
        this.idade = idade;
        this.alimento = alimento;
        this.velocidade = velocidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public Double getPeso() {
        return peso;
    }

    public String getAlimento() {
        return alimento;
    }

    protected void comer(){
        System.out.println("Alimento: "+getAlimento());
        System.out.println("Peso: "+getPeso());
    }

    public void mostrarIdade(){
        System.out.println("Idade: "+getIdade());
    }

    public void mover(){
        System.out.println("Velocidade: "+getVelocidade());
    }
}
