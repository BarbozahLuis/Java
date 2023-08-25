import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploGridLayout {
    public ExemploGridLayout() {
        JFrame janela1 = new JFrame("Exemplo de gridLayout");//frame por padrão é um grid layout
        JPanel painel1 = new JPanel();//panel é por padrão um fllow lyout
        GridLayout grid = new GridLayout(4,4);
        painel1.setLayout(grid);
        //adicionar o Jpanel ao JFrame(dentro da janela)
        janela1.getContentPane().add(painel1);

        //adicionar os componentes
        painel1.add(new JButton("c"));
        painel1.add(new JButton("0"));
        painel1.add(new JButton("1"));
        painel1.add(new JButton("2"));
        painel1.add(new JButton("/"));
        painel1.add(new JButton("3"));
        painel1.add(new JButton("4"));
        painel1.add(new JButton("5"));
        painel1.add(new JButton("*"));
        painel1.add(new JButton("6"));
        painel1.add(new JButton("7"));
        painel1.add(new JButton("8"));
        painel1.add(new JButton("-"));
        painel1.add(new JButton("9"));
        //config janela1 
        janela1.setBounds(500, 500, 500, 500);
        janela1.setDefaultCloseOperation(2);
        janela1.setVisible(true);
    }
}
