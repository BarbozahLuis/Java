

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{//classe de jframe
    public MainFrame() {
        super("App");
        setDefaultCloseOperation(2);//set do frame
        JTabbedPane abas = new JTabbedPane();//tabbed pane criado
        abas.add("Cadastro de Usuários", new CadastroUsuarios());//adicionei uma aba no tabbedpane
        abas.add("Agendamentos", new CadastroAgenda());//adicionando aba de agendamento no tabbedpane (titulo da aba e o q vai ter nela)
        add(abas);//adicionei a aba ao frame
    }
    public void run () {
        pack();
        setVisible(true);
    }
}
