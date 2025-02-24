package lista06.exercicio01;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private String cpf;
    private String endereco;

    public Cliente(String cpf, String endereco, String nome, LocalDate nascimento, String genero){
        super(nome, nascimento, genero);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String exibirDadosDoCliente(){
        return "\nCliente"+
        "\nNome: "+getNome()+
        "\nCpf: "+getCpf()+
        "\nEndereco: "+getEndereco()+
        "\nNascimento: "+getNascimento();
    }
}
