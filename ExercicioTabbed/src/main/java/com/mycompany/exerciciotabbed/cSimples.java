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

public class cSimples extends JPanel {

    private JButton botaoSoma;
    private JButton botaoSub;
    private JButton botaoDiv;
    private JButton botaoMult;
    private JTextField valor1;
    private JTextField valor2;
    private JTextField resultado;
    int soma;
    int subtracao;
    int divisao;
    int multiplicacao;

    public cSimples() {
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

        add(label1);
        add(valor1);
        add(label2);
        add(valor2);
        add(label3);
        add(resultado);
        add(botaoSoma);
        add(botaoSub);
        add(botaoDiv);
        add(botaoMult);

        Handler handler = new Handler();
        botaoSoma.addActionListener(handler);
        botaoSub.addActionListener(handler);
        botaoDiv.addActionListener(handler);
        botaoMult.addActionListener(handler);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            if (event.getActionCommand().equals("+")) {  // sempre que for comparar Strings usar o .equals
                soma = Integer.parseInt(valor1.getText()) + Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(soma));
            }
            if (event.getActionCommand().equals("-")) {
                subtracao = Integer.parseInt(valor1.getText()) - Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(subtracao));
            }
            if (event.getActionCommand().equals("*")) {
                divisao = Integer.parseInt(valor1.getText()) / Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(multiplicacao));
            }
            if (event.getActionCommand().equals("%")) {
                multiplicacao = Integer.parseInt(valor1.getText()) * Integer.parseInt(valor2.getText());
                resultado.setText(String.valueOf(divisao));
            }

        }
    }
}
