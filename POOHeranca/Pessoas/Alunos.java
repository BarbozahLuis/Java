package POOHeranca.Pessoas;

public class Alunos extends Pessoas { //subclasse de pessoas (ao transformar uma classe em abstract, eu nao poderia utilizar ela como objeto ou criar um objeto dela no app.java)
    //atributos especificos
    private int nMatricula;
    private String curso;
    private String turma;

    //métodos
    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
