package lista07.atividade01;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    private List<Funcionario> funcionarios;

    public FolhaPagamento(){
        funcionarios = new ArrayList<>();
    }

    public List<Funcionario> addFuncionario(Funcionario f){
        funcionarios.add(f);
        return funcionarios;
    }

    public void processarFolha(){
        for (Funcionario funcionario : funcionarios){
            funcionario.imprimirDados();
            System.out.println("Salario: "+funcionario.calcularSalario());
        }
    }
}
