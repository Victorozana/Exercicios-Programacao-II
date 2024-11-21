package lista03.exercicio01;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Victor", "Ozana", 1412.00);
        Funcionario funcionario2 = new Funcionario("Keliane", "Martins", 1550.00);

        System.out.println(" " +funcionario1.getPrimeiroNome() + " "+funcionario1.getSobreNome() + " Salario Anual: " +funcionario1.calcularSalarioAnual());
        System.out.println(" " +funcionario2.getPrimeiroNome() + " " +funcionario2.getSobreNome() + " Salario Anual: " +funcionario2.calcularSalarioAnual());

        double aumentoFuncionario1 = (funcionario1.calcularSalarioAnual() * 0.10) + funcionario1.calcularSalarioAnual();

        System.out.println("O aumento ANUAL foi de: "+aumentoFuncionario1);

        double aumentoFuncionario2 = (funcionario2.calcularSalarioAnual() * 0.10) + funcionario2.calcularSalarioAnual();

        System.out.println("O aumento ANUAL foi de: "+aumentoFuncionario2);
    }
}
