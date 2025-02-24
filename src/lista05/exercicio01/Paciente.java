package lista05.exercicio01;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Paciente(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = (validarCPF(cpf)) ? cpf : null;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * validador de cpf
     * @param cpf cpf digitado pelo usuario
     * @return verdadeiro para cpf verdadeiro e falso para falso
     */
    private boolean validarCPF(String cpf){
        if(cpf.length() < 12){
            int soma = 0;
            String primeiroDigito = cpf.substring(0, 9);
            for (int i = 0; i < primeiroDigito.length(); i ++){
                soma += Character.getNumericValue(primeiroDigito.charAt(i)) * (i+1);
            }
            soma = soma % 11;
            if (soma == 10){
                soma = 0;
            }
            if (soma == Character.getNumericValue(cpf.charAt(9))){
                int soma1 = 0;
                String segundoDigito = cpf.substring(0, 10);
                for (int i = 0;i < segundoDigito.length(); i ++){
                    soma1 += Character.getNumericValue(segundoDigito.charAt(i)) * i;
                }
                soma1 = soma1 % 11;
                if (soma1 == 10){
                    soma1 = 0;
                }
                if (soma1 == Character.getNumericValue(cpf.charAt(10))){
                    return true;
                }
            }
        }
        return false;
    }
}
