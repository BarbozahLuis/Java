package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Janela extends JFrame {
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public Janela() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs

        // tab de venda
        VendaView venda = new VendaView();
        jTPane.add("Vendas", venda);

        // tab produtoestoque
        ProdutoEstoque prodEstoq = new ProdutoEstoque();
        jTPane.add("Cadastro e Estoque", prodEstoq);

        // tab cliente
        ClienteView clientes = new ClienteView();
        
        jTPane.add("Cadastro de cliente", clientes);

        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // métodos para tornar a janela visível
    public void run() {
        pack();
        this.setVisible(true);
    }
}