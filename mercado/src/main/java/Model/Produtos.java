package Model;

public class Produtos {

    private String codigo;
    private String nome;
    private int quantidade;
    private double preco;
    

    public Produtos(String codigo, String nome, int quantidade, double preco ) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public void add(Produtos venda) {
    }

}

