package lista04.exercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private List<ContaBancaria> contas;

    public Cliente(String cpf, String nome) {
        this.cpf = (validarCPF(cpf)) ? cpf : null;
        this.nome = (!nome.isEmpty()) ? nome : null;
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome, String cpf, LocalDate dataNascimento, List <ContaBancaria> contas) {
        this(cpf, nome);
        this.dataNascimento = dataNascimento;
        this.contas = contas.isEmpty() ? new ArrayList<>() : contas;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = (!nome.isEmpty()) ? nome : null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf =  (validarCPF(cpf)) ? cpf : null;
    }

    public int getIdade(){
        return idade();
    }

    /**
     * @param conta a ser adicionada
     * @return ListaDeContas
     */
    public List<ContaBancaria> addConta(ContaBancaria conta){
        contas.add(conta);
       return contas;
    }

    /**
     * @return retorna a idade do Cliente
     */
    private Integer idade(){
        LocalDate hoje = LocalDate.now();
        return hoje.getYear() - this.dataNascimento.getYear();
    }

    /**
     * @return se o Cliente é de maior
     */
    protected boolean eMaior(){
        return idade() > 18;
    }

    /**
     * método para retornar a quantidade total de contas
     */
    public int quanTotalDeContas(){
        return contas.size();
    }

    /**
     * @return true para cpf válido, false para cpf invalido
     */
    private boolean validarCPF(String cpf){
        if(cpf.length() <= 12){
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

    /**
     * @return as informçaões do cliente
     */
    public String exibirCliente(){
        return "Cliente: " + getNome()+
        "\nCpf: " + getCpf()+
        "\nIdade: " + getIdade()+
        "\nLista de contas: " +quanTotalDeContas();
    }
}
