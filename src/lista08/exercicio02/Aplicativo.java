package lista08.exercicio02;

import java.util.ArrayList;
import java.util.Collection;

public class Aplicativo {
    public static void main(String[] args) {
        Collection<Funcionario> funcionarios = new ArrayList<>();
        Assalariado assalariado = new Assalariado("Victor", "TI", 2533.63);
        Comissionado comissionado = new Comissionado("Voneyman", "Vendedor", 10.0, 55000.69);
        Horista horista = new Horista("Gustavo", "Seguranca", 15.65, 220);
        Assalariado assalariado1 = new Assalariado("Keliane", "Chefe de RH", 2233.66);
        Comissionado comissionado1 = new Comissionado("Fernanda", "Vendedora", 10.0, 59000.69);
        Horista horista1 = new Horista("Aline", "Auxiliar de S. gerais", 15.50, 220);

        funcionarios.add(assalariado);
        funcionarios.add(assalariado1);
        funcionarios.add(comissionado);
        funcionarios.add(comissionado1);
        funcionarios.add(horista);
        funcionarios.add(horista1);

        for (Funcionario funcionario : funcionarios){
            System.out.println("O(a) funcionario(a) "+funcionario.getNome()+" com cargo "+funcionario.getCargo()+" devera receber R$"+funcionario.calcularTotalAPagar()+".");
        }
    }
}
