package lista03.exercicio02;

import java.util.Objects;

public class Proprietario { //Atributos
    private String nome;
    private String cpf;
    private String rg;
    private Integer telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Long cep;
    private String complemento;

   /*
       Getters e Setters
   */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = (nome == null || nome.trim().isEmpty()) ? "Proprietario não identificado" : nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = (Objects.nonNull(cpf) && eNumero(cpf) && validarCPF(cpf)) ? cpf : "0";
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = (Objects.nonNull(rg)) ? rg : "Não Informado.";
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Construtores
    public Proprietario(String nome, String rg, String cpf){
        setNome(nome);
        setRg(rg);
        setCpf(cpf);
      }

    /* métodos */
    private boolean eNumero(String str){
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e){
            return false;
        }
    }

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
