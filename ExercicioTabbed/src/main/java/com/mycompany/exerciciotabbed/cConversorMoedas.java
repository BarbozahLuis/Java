/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotabbed;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cConversorMoedas extends JPanel {

    private JRadioButton real;
    private JRadioButton real1;
    private JRadioButton euro;
    private JRadioButton euro1;
    private JRadioButton dolar;
    private JRadioButton dolar1;
    private JTextField resultado;
    private JTextField valor1;
    private JButton calcular;
    double realDolar;
    double realEuro;
    double realReal;
    double euroDolar;
    double euroReal;
    double euroEuro;
    double dolarEuro;
    double dolarReal;
    double dolarDolar;

    public cConversorMoedas() {
        JLabel label = new JLabel("Informe sua moeda e a quantidade");
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel("Informe a moeda que deseja receber");
        JLabel label4 = new JLabel("Resultado: ");
        valor1 = new JTextField(8);
        resultado = new JTextField(17);
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

        add(label);
        add(real);
        add(euro);
        add(dolar);
        add(label2);
        add(valor1);
        add(label3);
        add(real1);
        add(euro1);
        add(dolar1);
        add(calcular);
        add(label4);
        add(resultado);

        Handler handler = new Handler();
        calcular.addActionListener(handler);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            realDolar = (Double.parseDouble(valor1.getText()) / 5.19);
            realEuro = (Double.parseDouble(valor1.getText()) / 5.18);
            realReal = (Double.parseDouble(valor1.getText()) * 1);
            euroDolar = (Double.parseDouble(valor1.getText()) * 1);
            euroReal = (Double.parseDouble(valor1.getText()) * 5.18);
            euroEuro = (Double.parseDouble(valor1.getText()) * 1);
            dolarEuro = (Double.parseDouble(valor1.getText()) * 1);
            dolarReal = (Double.parseDouble(valor1.getText()) * 5.19);
            dolarDolar = (Double.parseDouble(valor1.getText()) * 1);

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

        }
    }
}
