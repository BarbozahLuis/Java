import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesAgenda {
    private List<Agenda> agendas;
    private DefaultTableModel modeloTabela;
    private JTable tabela;

    public OperacoesAgenda(List<Agenda> aegndas, DefaultTableModel modeloTabela, JTable tabela) {
        this.agendas = agendas;
        this.modeloTabela = modeloTabela;
        this.tabela = tabela;
    }

    public void cadastrarAgenda(String data, String hora, String usuario, String descricao) {
        //metodo q cria um obj da classe agenda e adiciona o obj na minha agendas (lista de coleções), após ele adicionar ele executa o atualizar tabela
        Agenda agenda = new Agenda(data, hora, usuario, descricao);
        agendas.add(agenda);
        atualizarTabela();
    }

    public void atualizarAgenda(int linhaSelecionada, String data, String hora, String usuario, String descricao) {
        //se a linha selecionada for diferente de -1
        if (linhaSelecionada != -1) {
            
            Agenda agenda = new Agenda(data, hora, usuario, descricao);
            agendas.set(linhaSelecionada, agenda);//utilizamos o set pois ele ja esta pegando um valor q ja existe. por isso nao utilizamos add 
            atualizarTabela();
        }
    }
    //apagar itens da agenda
    public void apagarAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarTabela();
        }
    }
    
    /*public void salvarAgendas() {
        Serializacao.serializar("dados.txt", usuarios);
    }*/
    //atualizar a tabela com os usuarios cadastrados/ sempre q eu executar uma ação o atualizar tabela sempre será executado
    private void atualizarTabela() {
        modeloTabela.setRowCount(0);
        for (Agenda agenda : agendas) {//for each sempre vai percorrer a tabela ele limpa e preenche ela novamente
            modeloTabela.addRow(new Object[] { agenda.getData(), agenda.getHoras(), agenda.getDescricao(), agenda.getUsuario() });
        }
    }
}
