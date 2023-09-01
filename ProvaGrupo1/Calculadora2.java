package ProvaGrupo1;

import javax.swing.*;
import java.awt.FlowLayout;

public class Calculadora2 extends JPanel {
    public Calculadora2() {
        super();
        this.add(new JLabel("Calculadora de Moedas"));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel painel = new JPanel(new FlowLayout(0));
        JPanel painel1 = new JPanel(new FlowLayout(0));

        JRadioButton real;
        JRadioButton real1;
        JRadioButton euro;
        JRadioButton euro1;
        JRadioButton dolar;
        JRadioButton dolar1;
        JTextField resultado;
        JTextField valor1;
        JButton calcular;

        JLabel label = new JLabel("Informe sua moeda e a quantidade");
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel("Informe a moeda que deseja receber");
        JLabel label4 = new JLabel("Resultado: ");
        
        valor1 = new JTextField(15);
        resultado = new JTextField(15);
        real = new JRadioButton("Real");
        real1 = new JRadioButton("Real");
        euro = new JRadioButton("Euro");
        euro1 = new JRadioButton("Euro");
        dolar = new JRadioButton("Dolar");
        dolar1 = new JRadioButton("Dolar");
        calcular = new JButton("Calcular");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(real);
        grupo.add(euro);
        grupo.add(dolar);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(real1);
        grupo1.add(euro1);
        grupo1.add(dolar1);

        this.add(label);
        this.add(real);
        this.add(euro);
        this.add(dolar);
        this.add(label2);
        
        this.add(painel);
        painel.add(valor1);

        this.add(label3);
        this.add(real1);
        this.add(euro1);
        this.add(dolar1);
        this.add(calcular);
        this.add(label4);
        
        this.add(painel1);
        painel1.add(resultado);

        calcular.addActionListener(e -> {

            double realDolar = (Double.parseDouble(valor1.getText()) / 5.19);
            double realEuro = (Double.parseDouble(valor1.getText()) / 5.18);
            double realReal = (Double.parseDouble(valor1.getText()) * 1);
            double euroDolar = (Double.parseDouble(valor1.getText()) * 1);
            double euroReal = (Double.parseDouble(valor1.getText()) * 5.18);
            double euroEuro = (Double.parseDouble(valor1.getText()) * 1);
            double dolarEuro = (Double.parseDouble(valor1.getText()) * 1);
            double dolarReal = (Double.parseDouble(valor1.getText()) * 5.19);
            double dolarDolar = (Double.parseDouble(valor1.getText()) * 1);

            if (real.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(realDolar + " dolares"));
            }
            if (real.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(realEuro + " euros"));
            }
            if (euro.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(euroReal + " reais"));
            }
            if (euro.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(euroDolar + " dolares"));
            }
            if (dolar.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(dolarReal + " reais"));
            }
            if (dolar.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(dolarEuro + " euros"));
            }
            if (real.isSelected() && real1.isSelected()) {
                resultado.setText(String.valueOf(realReal + " reais"));
            }
            if (dolar.isSelected() && dolar1.isSelected()) {
                resultado.setText(String.valueOf(dolarDolar + " dolares"));
            }
            if (euro.isSelected() && euro1.isSelected()) {
                resultado.setText(String.valueOf(euroEuro + " euros"));
            }
        });
    }
}
