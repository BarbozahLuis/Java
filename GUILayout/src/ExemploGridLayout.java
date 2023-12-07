import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ExemploGridLayout {
    public ExemploGridLayout() {
        //flow layout organiza em linhas
        //grid layout organiza em linhas e colunas
        //Jframe por padrão é um grid layout de uma linha e uma coluna
        JFrame janela1 = new JFrame("Exemplo de gridLayout");//frame por padrão é um grid layout
        BorderLayout border = new BorderLayout();
        janela1.setLayout(border);

        JPanel painel1 = new JPanel();//panel é por padrão um fllow layout
        janela1.getContentPane().add(painel1, BorderLayout.CENTER);

        GridLayout grid = new GridLayout(4,4);
        painel1.setLayout(grid);

        //adicionar o Jpanel ao JFrame(dentro da janela)
        janela1.getContentPane().add(painel1);

        //adicionar os componentes
        String textBotoes[] = {"C", "9", "8", "7", "/", "6", "5", "4", "*","3", "2", "1", "-", "+", "0", "="};
        for (int i = 0; i < textBotoes.length; i++) {
            painel1.add(new JButton(textBotoes[i]));
        }
        JPanel painel2 = new JPanel();
        JTextField campoTexto = new JTextField("", 40);
        janela1.getContentPane().add(painel2, BorderLayout.NORTH);
        painel2.add(campoTexto);

        
        //config janela1 
        janela1.setBounds(500, 500, 500, 500);
        janela1.setDefaultCloseOperation(2);
        janela1.setVisible(true);
    
    }
}
