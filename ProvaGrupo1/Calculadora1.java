package ProvaGrupo1;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.*;

public class Calculadora1 extends JPanel {
    public Calculadora1() {
        super();

        JTextField peso;
        JTextField altura;
        JButton calcular;
        
        setLayout(new GridLayout(20,1));
        
        JLabel label = new JLabel("Informe seu peso: ");
        peso = new JTextField(10);
        JLabel label1 = new JLabel("Informe sua altura: ");
        altura = new JTextField(10);
        calcular = new JButton("Calcular");
        
        

        add(label);
        add(peso);
        add(label1);
        add(altura);
        add(calcular);

        

        calcular.addActionListener(e -> {
            double soma = (Double.parseDouble(peso.getText())
                    / (Double.parseDouble(altura.getText()) * Double.parseDouble(altura.getText())));
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + soma);

            
        });

    }

}
