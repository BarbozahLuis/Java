import javax.swing.JOptionPane;

public class JOptionPaneExemplo extends JOptionPane{ //JOptionPane é um tipo de container utilizado para entrada de dados
    public JOptionPaneExemplo() {
        super();
        String informacao = "Minha Janela Dialog";
        this.showMessageDialog(getComponentPopupMenu(), informacao, informacao, JOptionPane.INFORMATION_MESSAGE);
    }
}
