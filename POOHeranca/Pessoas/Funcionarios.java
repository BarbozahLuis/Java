package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas{//extends serve pra estanciar a "super classe" podendo utilizar em outros arquivos caso ela seja super classe, consequentmente a classe funcionario é uma subclasse de pessoas
    int nCadastro;
    String setor;
    
    public int getnCadastro() {
        return nCadastro;
    }

    public void setnCadastro(int nCadastro) {
        this.nCadastro = nCadastro;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    
}
