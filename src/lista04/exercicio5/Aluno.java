package lista04.exercicio5;

import java.util.List;

public class Aluno  {
    private String nome;
    private Long matricula;
    private List<Double> notas;

    public Aluno(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = (!nome.isEmpty() && !nome.trim().isEmpty()) ? nome : null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    /**
     * @return media total do aluno
     */
    public Double mediaNotas(){
        Double media = 0.0;
        for (Double nota : notas){
            media += nota;
        }
        return media / notas.size();
    }
}
