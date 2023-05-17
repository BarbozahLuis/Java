package POOIntroducao;

public class App {
    public static void main(String[] args) {
        //criar o objeto
        RegistraAluno aluno1 = new RegistraAluno(); //obj
        
        //modificar os atributos(set)
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua Vito satalino");
        aluno1.setIdade(16);
        aluno1.setNotaCiencias(6);
        aluno1.setNotaMatematica(8);
        aluno1.setNotaPortugues(9);

        //acessar os atributos (get)
        System.out.println("Nome:"+aluno1.getNome());
        System.out.println("Endereço"+aluno1.getEndereco());
        System.out.println("Idade"+aluno1.getIdade());
        System.out.println("Media"+aluno1.getMedia());
    }
}
