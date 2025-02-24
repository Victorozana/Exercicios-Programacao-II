package lista08.exercicio02;

public abstract class Funcionario implements IPagar{
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
