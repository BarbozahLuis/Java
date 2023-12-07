package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendaView extends JPanel {
    private JTextField cpfField;
    private JTextField codigoProdutoField;
    private DefaultTableModel tableModel;

    public VendaView() {
        // Configurações da janela

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Painel superior com campos de entrada
        JPanel inputPanel = new JPanel(new FlowLayout());
        JButton cpfButton = new JButton("Digitar");
        cpfButton.addActionListener(e->{
            JOptionPane.showInputDialog(null, "Digite o CPF");
        });
        
        codigoProdutoField = new JTextField(10);
        JButton adicionarButton = new JButton("Adicionar");
        
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        inputPanel.add(new JLabel("CPF: "));
        inputPanel.add(cpfButton);
        inputPanel.add(new JLabel("Código do Produto: "));
        inputPanel.add(codigoProdutoField);
        inputPanel.add(adicionarButton);

        // Tabela para mostrar informações do produto
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Preço");
        JTable table = new JTable(tableModel);

        // Adiciona os componentes ao painel principal
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Adiciona o painel principal à janela
        add(panel);

        // Exibe a janela
        setVisible(true);
    }

    private void adicionarProduto() {
        // Aqui você pode implementar a lógica para buscar as informações do produto
        // pelo código
        // e adicioná-las à tabela

        String codigoProduto = codigoProdutoField.getText();
        // Suponha que você tenha uma classe Produto com os atributos codigo, nome e
        // preco
        Produto produto = buscarProdutoPorCodigo(codigoProduto);

        if (produto != null) {
            // Adiciona uma nova linha à tabela com as informações do produto (colocar
            // mensagem de erro)
            tableModel.addRow(new Object[] { produto.getCodigo(), produto.getNome(), produto.getPreco(),
                    produto.getQuantidade() });
        } else {
            JOptionPane.showMessageDialog(this, "Produto não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método fictício para buscar informações do produto pelo código
    private Produto buscarProdutoPorCodigo(String codigo) {
        // Implemente a lógica de busca do produto no banco de dados ou em alguma
        // estrutura de dados
        // Neste exemplo, estamos retornando um produto fictício
        return new Produto(codigo, "Produto Exemplo", 10.99, 1);
    }

    // Classe fictícia para representar um produto
    private class Produto {
        private String codigo;
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String codigo, String nome, double preco, int quantidade) {
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
    }

}
