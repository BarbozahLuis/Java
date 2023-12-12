package Model;

public class Cliente {
    //Atributos

    private String cpf;
    private String nome;

    public Cliente(String text, String text2, Object object) {
    }

    public void CadastrodeClientes(String Ano, String cidade, String cpf, String dataNascimento, String endereco, String nome, String rg) {
        this.cpf = cpf;
        this.nome = nome;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object add(Cliente cliente) {
        return null;
    }

}
