/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciotabbed;

/**
 *
 * @author Aluno
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cIMC extends JPanel {

    private JTextField peso;
    private JTextField altura;
    private JButton calcular;
    double soma;

    public cIMC() {
        JLabel label = new JLabel("Informe seu peso: ");
        peso = new JTextField(15);
        JLabel label1 = new JLabel("Informe sua altura: ");
        altura = new JTextField(15);
        calcular = new JButton("Calcular");

        add(label);
        add(peso);
        add(label1);
        add(altura);
        add(calcular);

        Handler handler = new Handler();
        calcular.addActionListener(handler);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            soma = (Double.parseDouble(peso.getText()) / (Double.parseDouble(altura.getText()) * Double.parseDouble(altura.getText())));
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + soma);
        }
    }

}
