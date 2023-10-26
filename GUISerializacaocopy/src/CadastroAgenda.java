

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;

public class CadastroAgenda extends JPanel {
    //atributos
    //espaço para digitar o texto
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputUsuario;
    private JTextField inputDescricao;

    //criando a tabela (JTable) e o modelo da tabela q seria a quantidade de linhas e colunas
    private DefaultTableModel modeloTabela;
    private JTable tabela;
    private int linhaSelecionada = -1;

    private List<Agenda> agendas = new ArrayList<>();
    
    public CadastroAgenda() {
        //criando o obj da tabela e a quantidade de colunas
        modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Data");
        modeloTabela.addColumn("Horario");
        modeloTabela.addColumn("Usuario");
        modeloTabela.addColumn("Descrição");
        tabela = new JTable(modeloTabela);//a tabela é criada com base no modeloTabela
        //rolagem da tela
        JScrollPane scrollPane = new JScrollPane(tabela);
        //add componentes de entrada de data, hora, usuario e descrição
        inputData = new JTextField(8);
        inputHora = new JTextField(5);
        inputUsuario = new JTextField(10);
        inputDescricao = new JTextField(20);
        //Criando botões
        JButton cadastrarButton = new JButton("Agendar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton salvarButton = new JButton("Salvar");
        JPanel inputPanel = new JPanel();
        
        //adicionando botões
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Usuario:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(salvarButton);
        
        //set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //tratamento de eventos

        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = tabela.rowAtPoint(evt.getPoint());
            }
        });
        //chamando obj da classe operações
        OperacoesAgenda operacoes = new OperacoesAgenda(agendas, modeloTabela, tabela);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarAgenda(inputData.getText(), inputHora.getText(), inputUsuario.getText(), inputDescricao.getText());
                //marcar o texto como vazio
                inputData.setText("");
                inputHora.setText("");
                inputUsuario.setText("");
                inputDescricao.setText("");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        //atualizar agenda
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada, inputData.getText(), inputHora.getText(), inputUsuario.getText(), inputDescricao.getText());

            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarAgenda(linhaSelecionada);
            }
        });
        
        /*salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios();
            }
        });*/
    }

    private void atualizarTabela() {
        modeloTabela.setRowCount(0);
        for (Agenda agenda : agendas) {//for each sempre vai percorrer a tabela ele limpa e preenche ela novamente
            modeloTabela.addRow(new Object[] { agenda.getData(), agenda.getHoras(), agenda.getDescricao(), agenda.getUsuario() });
        }
    }
    }
    

