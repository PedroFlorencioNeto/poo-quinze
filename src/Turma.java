import java.util.ArrayList;

public class Turma {
    protected int codigoTurma;
    protected String diciplinaString;
    protected String alunoString;
    protected String professorString;
    @SuppressWarnings("rawtypes")
    protected ArrayList alunoList;

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigo) {
        this.codigoTurma = codigo;
    }

    public String getDiciplinaString() {
        return diciplinaString;
    }

    public void setDiciplinaString(String dicString) {
        this.diciplinaString = dicString;
    }

    public String getAlunoString() {
        return alunoString;
    }

    public void setAlunoString(String aluno) {
        this.alunoString = aluno;
        this.adicionarAluno(this.alunoString);
    }

    public String getProfessorString() {
        return professorString;
    }

    public void setProfessor(String professor) {
        this.professorString = professor;
    }
    
    public void adicionarAluno(String aluno) {
        this.alunoList.add(aluno);
    }

    public void removerAluno(String aluno) {
        this.alunoList.remove(aluno);
    }

    public void listarAluno() {      
      for (int i = 0; i < alunoList.size(); i++) {
        String aluno = (String) alunoList.get(i);
        System.out.println("Aluno: Nº"+ i +" - "+ aluno);
      }
        
    }
} 