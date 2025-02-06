package lista07.atividade01;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Double salarioBase;

    public Funcionario(String nome, String cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
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
        if (cpf.length() != 11){
            return false;
        }
        String cpf1 = cpf.substring(0, 9);
        int cont = 10;
        int soma = 0;
        for (int i = 0; i < cont; i++){
            soma = cpf1.charAt(i) * cont;
            cont --;
        }
        return true;
    }
}
