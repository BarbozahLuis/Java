package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Elevadores;

public class Janela extends JFrame{

    private JLabel statusLabel;
    private JButton[] botao;



    public Janela(){

        

        setTitle("Simulação de Prédio");
        setSize(300, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        statusLabel = new JLabel("Status: Inicializando...");
        add(statusLabel, BorderLayout.NORTH);

        // Criando os andares do prédio
        JPanel predio = new JPanel();
        predio.setLayout(new BoxLayout(predio, BoxLayout.Y_AXIS));

        Elevadores obj = new Elevadores();
        
        
        // Adicionando os andares ao prédio
        for (int i = 0; i < 9; i++) {
            JPanel andar = new JPanel();
            andar.setBorder(BorderFactory.createTitledBorder("Andar " + (i+1)));
            andar.setPreferredSize(new java.awt.Dimension(280, 60));
            
            // Adicionando botões para representar apartamentos no andar
            botao = new JButton[9];
            for (int j = 0; j < 1; j++) {
                botao[i] = new JButton("Apartamento " + (j+1));
                int numeroAndar = i;
                botao[i].addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        obj.moveElevator(i);
                        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                    }
                    
                    
                });
            }
            
            predio.add(andar);
        }
        
        getContentPane().add(predio);
        setVisible(true);
        
}}