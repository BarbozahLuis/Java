package POOExercicio3;

public class Elevador {
    //atributos
    int qtdPessoasAtual;
    int qtdMaxPessoas;
    int nMaxAndares;
    int andarAtual;
    //métodos
    //construtor
    public Elevador(int qtdMaxPessoas, int nMaxAndares) {
        this.qtdMaxPessoas = qtdMaxPessoas;
        this.nMaxAndares = nMaxAndares;
    }
    //set get
    public int getQtdMaxPessoas() {
        return qtdMaxPessoas;
    }
    public void setQtdMaxPessoas(int qtdMaxPessoas) {
        this.qtdMaxPessoas = qtdMaxPessoas;
    }
    public int getnMaxAndares() {
        return nMaxAndares;
    }
    public void setnMaxAndares(int nMaxAndares) {
        this.nMaxAndares = nMaxAndares;
    }
    // métodos próprios
    //inicializa

    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }
    // primeira ação: entrar
    public int entrar(){
        if(qtdPessoasAtual<qtdMaxPessoas){
            qtdPessoasAtual++;
        }else{
            System.out.println("Não vai entrar ninguem");
        }
        return qtdPessoasAtual;
    }
    //segunda ação: sair
    public int sair(){
        if(qtdPessoasAtual>0){
            qtdPessoasAtual--;
        }else{
            System.out.println("Não tem ninguem para sair");
        }
        return qtdPessoasAtual;
}
    //terceira ação: subir
    public int subir(int nAndares){
        if(andarAtual+nAndares<=nMaxAndares){
            andarAtual+=nAndares;
        }else{
            System.out.println("informe um nº válido");
        }
        return andarAtual;
    }
    //quarta ação: descer
    public int descer(int nAndares){
        if(andarAtual-nAndares>=0){
            andarAtual-=nAndares;
        }else{
            System.out.println("informe um nº válido");
        }
        return andarAtual;
}
}
