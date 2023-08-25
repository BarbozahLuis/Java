import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class ExemploFlowLayout {
    public ExemploFlowLayout() {
        //criar uma janela do tipo frame
        JFrame janela1 = new JFrame("Janela FlowLayout");
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);
        
        //criar janelas e os botões
        janela1.add(new JLabel("n° de botões"));
        
        //criar um campo de texto
        JTextField campoTexto = new JTextField("Insira um valor", 25);
        
        //adicionar o campo texto dentro da janela
        janela1.add(campoTexto);
        
        //janela1.add(new JTextField ("Insira um valor", 25));
        JButton enviar = new JButton("Enviar");
        janela1.add(enviar);
        //criar botão enviar/ adicionar uma ação
        enviar.addActionListener(e ->{
            int valor = Integer.parseInt(campoTexto.getText());
            for ( int i = 0; i < valor; i++) {
                janela1.add(new JButton(""+i+1));
            }
            janela1.pack();
        });
        //setar os elementos da janela
        janela1.setDefaultCloseOperation(1);
        janela1.pack();
        janela1.setVisible(true);

    }
}
