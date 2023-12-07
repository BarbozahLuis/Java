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

public class cPesoIdeal extends JPanel {

    private JRadioButton botaoH;
    private JRadioButton botaoM;
    private JButton calcular;
    private JTextField altura;
    private JTextField resultado;
    double pesoH;
    double pesoM;

    public cPesoIdeal() {
        JLabel label = new JLabel("Digite sua altura:");
        altura = new JTextField(15);
        JLabel label1 = new JLabel("Informe seu sexo");
        botaoH = new JRadioButton("Masculino");
        botaoM = new JRadioButton("Feminino");
        JLabel label2 = new JLabel("Peso ideal:");
        resultado = new JTextField(15);
        calcular = new JButton("Calcular");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(botaoH);
        grupo.add(botaoM);

        add(label);
        add(altura);
        add(label1);
        add(botaoH);
        add(botaoM);
        add(calcular);

        Handler handler = new Handler();
        calcular.addActionListener(handler);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            pesoH = (72.7 * Double.parseDouble(altura.getText()) - 58);
            pesoM = (62.1 * Double.parseDouble(altura.getText()) - 44.7);

            if (botaoH.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoH + " KG");

            }
            if (botaoM.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoM + " KG");
            }

        }
    }

}
