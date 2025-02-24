package lista04.exercicio5;

import java.util.List;

public class Turma {
    private String nomeTurma;
    private String anoLetivo;
    private List<Aluno> alunos;
    private Professor professor;

    public Turma(String nomeTurma, String anoLetivo, List<Aluno> alunos, Professor professor){
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }


    /**
     * adiciona um aluno a lista
     * @param aluno a ser adicionado
     * @return
     */
    public List<Aluno> addAluno(Aluno aluno){
        alunos.add(aluno);
        return alunos;
    }

    /**
     * mostra os alunos aprovados da turma
     */
    public void approvedStudents(){
        for (Aluno aluno : alunos){
            if (aluno.mediaNotas() >= 6) {
                System.out.println("Aluno aprovado: " + aluno.getNome());
            }
        }
    }

    /**
     * demonstra as informações da turma
     */
    public void showInformations(){
        System.out.println("Turma: "+getNomeTurma());
        for (Aluno aluno : alunos){
            System.out.println("Aluno: "+aluno.getNome());
        }
        System.out.println("Professor(a): "+getProfessor().getNome());
    }

    /**
     * muda o professor de turma
     * @param professor professor a ser inserido na turma (professor novo)
     * @return lista atualizada do novo professor
     */
    public Professor chanceProfessor(Professor professor){
        return this.professor = professor;
    }
}
