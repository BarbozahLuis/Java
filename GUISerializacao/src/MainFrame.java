package GUISerializacao.src;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{//classe de jframe
    public MainFrame() {
        super("App");
        setDefaultCloseOperation(2);//set do frame
        JTabbedPane abas = new JTabbedPane();//tabbed pane criado
        abas.add("Cadastro de Usuários", new CadastroUsuarios());//adicionei uma aba no tabbedpane
        add(abas);//adicionei a aba ao frame
    }
    public void run () {
        pack();
        setVisible(true);
    }
}
