package POOIntroducao;

public class RegistraAluno {
    //Atributos dos objetos
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    //Atributo de classe
    private static int contadorEstudantes; //contador

    //métodos atributos de get= acessar informação do atributo

    //criação de metodos
//retorna o nome do estudante
public String getNome(){
    return nome;
    }
    //retorna o endereço do estudante
    public String getEndereco(){
    return endereco;
    }
    // retorna idade do estudante
    public int getIdade(){
    return idade;
    }
    //retorna a média do estudante
    public double getMedia(){
    double resultado = 0;
    resultado = (notaMatematica
    + notaPortugues
    + notaCiencias) / 3;
    
    return resultado;
    }
    // retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos(){
    return contadorEstudantes;
    }

    //métodos de modificação dos atributos o famoso "set"

    // define ou altera o nome do estudante
public void setNome(String nome){
    this.nome = nome;
    }
    // define ou altera o endereço do estudante
    public void setEndereco(String endereço){
    this.endereco = endereço;
    }
    // define ou altera o endereço do estudante
    public void setIdade(int idade){
    this.idade = idade;
    }
    // define ou altera o endereço do estudante
    public void setNotaMatematica(double notaMatematica){
    this.notaMatematica = notaMatematica;
    }
    // define ou altera o endereço do estudante
    public void setNotaPortugues(double notaPortugues){
    this.notaPortugues = notaPortugues;
    }
    // define ou altera o endereço do estudante
    public void setNotaCiencias(double notaCiencias){
    this.notaCiencias = notaCiencias;
    }

}
