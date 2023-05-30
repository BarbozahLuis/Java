package POOExercicio1;

public class Pessoa{
    //atributos (nome,altura,dataNascimento)
    String nome;
    double altura;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    //construtores
    public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
    public Pessoa() { 
        // construtor vazio      
    }
    public String getNome() { //get vc busca algo
        return nome;
    }//set vc altera algo no objeto
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //outros metodos
    //2 tipos de metodos void //return
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Data de Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
    }
    public int getIdade(){
        int idade;
        if(diaNascimento<=30 && mesNascimento<=5){
            idade = 2023-anoNascimento;
        }else{
            idade = 2023-anoNascimento - 1;
        }
        return idade;

    }
}