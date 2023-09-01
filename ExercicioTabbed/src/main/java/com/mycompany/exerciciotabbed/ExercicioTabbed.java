/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exerciciotabbed;

/**
 *
 * @author Aluno
 */
import javax.swing.*;

public class ExercicioTabbed {

    private String calculoIMC = "Calculadora IMC";
    private String calculoPesoIdeal = "Caculadora Peso Ideal";
    private String calculoSimples = "Caculadora Simples";
    private String calculoConversor = "Conversor de Moedas";

    public void janela() {

        JFrame jframe = new JFrame();
        JTabbedPane jTPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        tab1.add(new cIMC());

        JPanel tab2 = new JPanel();
        tab2.add(new cPesoIdeal());

        JPanel tab3 = new JPanel();
        tab3.add(new cSimples());

        JPanel tab4 = new JPanel();
        tab4.add(new cConversorMoedas());

        jTPane.add(calculoIMC, tab1);
        jTPane.add(calculoPesoIdeal, tab2);
        jTPane.add(calculoSimples, tab3);
        jTPane.add(calculoConversor, tab4);

        jframe.add(jTPane);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 500, 500);
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        
        ExercicioTabbed tab = new ExercicioTabbed();
        tab.janela();

    }
}
