package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        Alunos aluno01 = new Alunos();
        Pessoas pessoa01 = new Pessoas();
        Funcionarios func01 = new Funcionarios();
        Professores prof01 = new Professores();
       
        //set Aluno
        aluno01.setNome("Lebron James");
        aluno01.setCurso("developer");
        aluno01.setIdade(23);
        aluno01.setEndereco("vito satalino");
        aluno01.setTurma("devNotuno");
        aluno01.setnCpf("397.190.298-70");
        aluno01.setnMatricula(3425);
        //get Aluno
        System.out.println("Nome: "+aluno01.getNome());
        System.out.println("Curso: "+aluno01.getCurso());
        System.out.println("Idade: "+aluno01.getIdade());
        System.out.println("Endereço: "+aluno01.getEndereco());
        System.out.println("Turma: "+aluno01.getTurma());
        System.out.println("CPF: "+aluno01.getnCpf());
        System.out.println("Nº Matricula: "+aluno01.getnMatricula());
        
        pessoa01.setIdade(19);
       
       
        func01.setSetor("null");

        prof01.getNome();
    }
}
