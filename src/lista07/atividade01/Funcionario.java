package lista07.atividade01;

import java.util.Objects;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = (validarCpf(cpf)) ? cpf : null;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public abstract Double calcularSalario();

    public void imprimirDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Salario Base: "+getSalarioBase());
    }

    private boolean validarCpf(String cpf){
        if (cpf.length() == 11){
            Integer d1 = calcularDigito(cpf.substring(0,9), 0, 0);
            Integer d2 = calcularDigito(cpf.substring(1,10), 0, 0);
            boolean valido = String.valueOf(cpf.charAt(9)).equals(d1.toString()) &&
                    String.valueOf(cpf.charAt(10)).equals(d2.toString());
            return valido;
        }
        return false;
    }

    private Integer calcularDigito(String cpf, Integer soma, Integer posicao){
        if (posicao == 9){
            int digito = soma % 11;
            return (digito > 9) ? 0 : digito;
        }
        soma += Integer.parseInt(String.valueOf(cpf.charAt(posicao))) * (posicao + 1);
        return calcularDigito(cpf, soma, posicao + 1);
    }


}
