package Model;

public class Venda {

    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Venda(String codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Venda(String string, String string2, int int1, double double1) {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void add(Venda venda) {
    }

}
