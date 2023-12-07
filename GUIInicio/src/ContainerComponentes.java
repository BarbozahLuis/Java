import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class ContainerComponentes extends JFrame{ //container é aquilo que contem alguma coisa, uma caixa que irá conter COMPONENTES
    public ContainerComponentes() {//construtor
        //super("Exemplo Janela");
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200, 200, 400, 400); // x e y distancia da caixa referente a tela, e as outras informações são as medidas do tamanho da caixa
        //FlowLayout flow = new FlowLayout();
       
        //this.setLayout(flow);
        JPanel painel = new JPanel(); //por padrão é um flowlayout
        this.getContentPane().add(painel);
        for (int i = 0; i < 6; i++) {
            this.add(new JButton("Number"+i));
        }
        this.setVisible(true);
    }
}
