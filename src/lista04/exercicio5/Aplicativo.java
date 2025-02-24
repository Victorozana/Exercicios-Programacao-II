package lista04.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        Professor professor = new Professor("Nubia", 1222);

        Aluno aluno1 = new Aluno(20241080080004L, "Victor Ozana da Silva Oliveira");
        Aluno aluno2 = new Aluno(20241080080001L, "Janete de Sousa Santos");
        Aluno aluno3 = new Aluno(20241080080002L, "Silva Calado Meireles");
        Aluno aluno4 = new Aluno(20241080080005L, "Roberto Carlos di Caprio");

        List<Aluno> alunosTurma1 = new ArrayList<>();
        List<Aluno> alunosTurma2 = new ArrayList<>();

        alunosTurma1.add(aluno1);
        alunosTurma1.add(aluno2);

        alunosTurma2.add(aluno3);
        alunosTurma2.add(aluno4);

        Turma turma1 = new Turma("B", "2º série", alunosTurma1, professor);
        Turma turma2 = new Turma("A", "2º série", alunosTurma2, professor);

        List<Double> notasAluno1 = new ArrayList<>();
        List<Double> notasAluno2 = new ArrayList<>();
        List<Double> notasAluno3 = new ArrayList<>();
        List<Double> notasAluno4 = new ArrayList<>();

        notasAluno1.add(6.0);
        notasAluno1.add(8.5);
        aluno1.setNotas(notasAluno1);

        notasAluno2.add(4.0);
        notasAluno2.add(2.0);
        aluno2.setNotas(notasAluno2);

        notasAluno3.add(8.0);
        notasAluno3.add(10.0);
        aluno3.setNotas(notasAluno3);

        notasAluno4.add(6.0);
        notasAluno4.add(6.0);
        aluno4.setNotas(notasAluno4);

        turma1.approvedStudents();

        turma1.showInformations();

        turma2.showInformations();

        turma2.approvedStudents();
    }
}
