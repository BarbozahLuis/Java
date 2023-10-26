package GUISerializacao.src;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CadastroAgenda extends JPanel {
    //atributos
    //espaço para digitar o texto
    private JTextField inpuData;
    private JTextField inputHora;
    private JTextField inputName;
    private JTextField inputDescricao;

    //criando a tabela (JTable) e o modelo da tabela q seria a quantidade de linhas e colunas
    private DefaultTableModel modeloTabela;
    private JTable tabela;

    private List<Agenda> agenda = new ArrayList<>();
    
    public CadastroAgenda() {
        //criando o obj da tabela e a quantidade de colunas e 
        modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Data");
        modeloTabela.addColumn("Horario");
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Descrição");
        tabela = new JTable(modeloTabela);
        //rolagem da tela
        JScrollPane scrollPane = new JScrollPane(tabela);

        


    }
    
}
