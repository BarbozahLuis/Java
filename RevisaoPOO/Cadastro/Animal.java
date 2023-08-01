package RevisaoPOO.Cadastro;

public class Animal {
    //atributos
    String nome;
    String peso;
    String proprietario;
    int cadastro;
    
    //métodos
    //construtor cheio
    public Animal(String nome, String peso, String proprietario) {
        this.nome = nome;
        this.peso = peso;
        this.proprietario = proprietario;
    }
    //construtor vazio
    public Animal(){}
    //get and set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public int getCadastro() {
        return cadastro;
    }
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }
    

    
}
