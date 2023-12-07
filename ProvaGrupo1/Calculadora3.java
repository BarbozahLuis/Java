package ProvaGrupo1;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class Calculadora3 extends JPanel {
    public Calculadora3() {
        super();
        this.add(new JLabel("Calculadora 3"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();

        JButton botaoSoma;
        JButton botaoSub;
        JButton botaoDiv;
        JButton botaoMult;
        JTextField valor1;
        JTextField valor2;
        JTextField resultado;

        JLabel label1 = new JLabel("Digite um valor:");
        valor1 = new JTextField(15);
        JLabel label2 = new JLabel("Digite um valor:");
        valor2 = new JTextField(15);
        JLabel label3 = new JLabel("Resultado:");
        resultado = new JTextField(15);
        botaoSoma = new JButton("+");
        botaoSub = new JButton("-");
        botaoDiv = new JButton("%");
        botaoMult = new JButton("*");

        painel1.add(painel1);
        painel1.add(label1);
        painel1.add(valor1);
        
        painel2.add(painel2);
        painel2.add(label2);
        painel2.add(valor2);

        painel3.add(painel3);
        painel3.add(label3);
        painel3.add(resultado);
        
        this.add(painel4);
        painel4.add(botaoSoma);
        painel4.add(botaoSub);
        painel4.add(botaoDiv);
        painel4.add(botaoMult);

        botaoSoma.addActionListener(e -> {
            if (botaoSoma.getActionCommand().equals("+")) { // sempre que for comparar Strings usar o .equals
                int soma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(soma));
            }
        });
        botaoSub.addActionListener(e -> {
            if (botaoSub.getActionCommand().equals("-")) {
                int subtracao = Integer.parseInt(valor1.getText()) - Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(subtracao));
            }
        });
        botaoDiv.addActionListener(e -> {
            if (botaoDiv.getActionCommand().equals("*")) {
                int divisao = Integer.parseInt(valor1.getText()) / Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(divisao));
            }
        });
        botaoMult.addActionListener(e -> {
            if (botaoMult.getActionCommand().equals("%")) {
                int multiplicacao = Integer.parseInt(valor1.getText()) * Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(multiplicacao));
            }
        });
    }
}
