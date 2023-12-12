package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;

import Model.Cliente;

public class ClienteView extends JPanel {

    private JButton cadastrar, apagar, editar;
    private JTextField cpfField, nomeField;
    private List<Cliente> cadastros;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    public ClienteView() {
        super();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro de Pessoas"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(7, 2));
        inputPanel.add(new JLabel("CPF"));
        cpfField = new JTextField(20);
        inputPanel.add(cpfField);
        inputPanel.add(new JLabel("Nome"));
        nomeField = new JTextField(20);
        inputPanel.add(nomeField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        cadastrar = new JButton("Cadastrar");
        editar = new JButton("Editar");
        apagar = new JButton("Apagar");
        botoes.add(cadastrar);
        botoes.add(editar);
        botoes.add(apagar);
        add(botoes);

        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][]{},
                new String[]{"CPF", "Nome"});
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        criaTabela();
        atualizarTabela();

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    cpfField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    nomeField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });

        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
                limparCampos();
                atualizarTabela();
            }
        });

        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
                limparCampos();
                atualizarTabela();
            }
        });

        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apagar();
                limparCampos();
                atualizarTabela();
            }
        });
    }

    private void criaTabela() {
        cadastros = new ArrayList<>();
    }

    private void cadastrar() {
        Cliente novoCadastro = new Cliente(
                cpfField.getText(),
                nomeField.getText()
        );
        cadastros.add(novoCadastro);
    }

    private void editar() {
        if (linhaSelecionada != -1) {
            Cliente cadastroSelecionado = cadastros.get(linhaSelecionada);
            cadastroSelecionado.setCpf(cpfField.getText());
            cadastroSelecionado.setNome(nomeField.getText());
        }
    }

    private void apagar() {
        if (linhaSelecionada != -1) {
            cadastros.remove(linhaSelecionada);
            linhaSelecionada = -1;
        }
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Cliente cadastro : cadastros) {
            tableModel.addRow(new Object[]{ cadastro.getCpf(),
             cadastro.getNome()});
        }
    }

    private void limparCampos() {
        cpfField.setText("");
        nomeField.setText("");
    }
}
