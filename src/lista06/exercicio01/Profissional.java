package lista06.exercicio01;

import java.time.LocalDate;

public class Profissional extends Pessoa{
    private Integer registroProfissional;
    private String cargo;


    public Profissional(Integer registroProfissional, String cargo, String nome, LocalDate nascimento, String genero){
        super(nome, nascimento, genero);
        this.registroProfissional = registroProfissional;
        this.cargo = cargo;
    }

    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public String getCargo() {
        return cargo;
    }

    public String exibirDadosProfissionais(){
        return "\nProfissional"+
        "\nNome: "+getNome()+
        "\nCargo: "+getCargo()+
        "\nRegistro: "+getRegistroProfissional()+
        "\nGenero: "+getGenero();
    }
}
