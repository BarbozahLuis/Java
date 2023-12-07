import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;

public class ExemploBorderLayout {
    public ExemploBorderLayout() {
        super();
        JFrame janela1 = new JFrame("Janela Principal");
        BorderLayout border = new BorderLayout();
        janela1.setLayout(border);
        janela1.add(new JButton("West"), BorderLayout.WEST);
        janela1.add(new JButton("East"), BorderLayout.EAST);
        janela1.add(new JButton("North"), BorderLayout.NORTH);
        janela1.add(new JButton("South"), BorderLayout.SOUTH);
        janela1.add(new JButton("CENTER"), BorderLayout.CENTER);

        janela1.setDefaultCloseOperation(1);
        janela1.pack();
        janela1.setVisible(true);
    }
}
