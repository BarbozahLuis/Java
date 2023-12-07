package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoEstoque extends JPanel {
    private JTextField codigoField;
    private JTextField nomeField;
    private JTextField quantidadeField;
    private JTextField valorField;
    private DefaultTableModel tableModel;

    public ProdutoEstoque() {

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Painel superior com campos de entrada
        JPanel inputPanel = new JPanel(new FlowLayout());
        codigoField = new JTextField(10);
        nomeField = new JTextField(10);
        quantidadeField = new JTextField(10);
        valorField = new JTextField(10);

        JButton adicionarButton = new JButton("Adicionar Produto");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        inputPanel.add(new JLabel("Código: "));
        inputPanel.add(codigoField);
        inputPanel.add(new JLabel("Nome: "));
        inputPanel.add(nomeField);
        inputPanel.add(new JLabel("Quantidade: "));
        inputPanel.add(quantidadeField);
        inputPanel.add(new JLabel("Valor: "));
        inputPanel.add(valorField);
        inputPanel.add(adicionarButton);

        // Tabela para mostrar o estoque
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Código");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Valor");
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
        // Obtém os valores dos campos de entrada
        String codigo = codigoField.getText();
        String nome = nomeField.getText();
        int quantidade = Integer.parseInt(quantidadeField.getText());
        double valor = Double.parseDouble(valorField.getText());

        // Adiciona uma nova linha à tabela com as informações do produto
        tableModel.addRow(new Object[]{codigo, nome, quantidade, valor});

        // Limpa os campos de entrada após adicionar o produto
        codigoField.setText("");
        nomeField.setText("");
        quantidadeField.setText("");
        valorField.setText("");
    }

}

