package lista03.exercicio01;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Victor", "Ozana", 1412.55);

        Funcionario funcionario2 = new Funcionario("Keliane", "Martins", 1513.33);

        System.out.println("Salario anual de Victor: "+funcionario1.calcularSalarioAnual()+" \n Salario anual de Keliane: "+funcionario2.calcularSalarioAnual());

        System.out.println("Salario anual de Victor: "+funcionario1.aumento()+" \n Salario anual de Keliane: "+ funcionario2.aumento());
    }
}
