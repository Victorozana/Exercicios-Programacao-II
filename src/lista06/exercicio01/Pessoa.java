package lista06.exercicio01;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;
    private String genero;

    public Pessoa(String nome, LocalDate nascimento, String genero) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getGenero() {
        return genero;
    }
}
