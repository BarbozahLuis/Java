import java.awt.CardLayout;

import javax.swing.*;

public class Exercicio5 extends JFrame{
    //chamar o construtor
    public Exercicio5() {
        super();
        //criar o painel, cardlayout e setar o cardlayout no painel e tbm adicionar o painel principal ao frame
        JPanel painel = new JPanel();
        CardLayout cl = new CardLayout();
        painel.setLayout(cl);
        this.add(painel);  
        //criar card 1, elementos 
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem vindo ao quiz de basquete!! Vamos começar?"));
        JButton next = new JButton("Next");
        card1.add(next);
        painel.add(card1, "Principal");
        
        //criar card 2, primeira pergunta
        JPanel card2 = new JPanel();
        JButton next1 = new JButton("Next");
        card2.add(new JLabel("Qual jogador mais velho atualmente na NBA?"));
        card2.add(new JLabel("Andre Iguodala, Lebron James ou Rajon Rondo"));
        card2.add(new JTextField());
        card2.add(next1);
        painel.add(card2, "Pergunta 1");

        //criar card 3, segunda pergunta
        JPanel card3 = new JPanel();
        JButton next2 = new JButton("Next");
        card3.add(new JLabel("Qual o melhor arremessador da NBA atualmente?"));
        card3.add(new JLabel("Ray Allen, Oscar Schimit ou Stephen Curry"));
        card3.add(new JTextField());
        card3.add(next2);
        painel.add(card3, "Pergunta 2");

        //criar card 4, terceira pergunta
        JPanel card4 = new JPanel();
        JButton next3 = new JButton("Next");
        card4.add(new JLabel("Qual o Maior pontuador dos Playoffs?"));
        card4.add(new JLabel("Lebron James, Kevin Durant ou Stephen Curry"));
        card4.add(new JTextField());
        card4.add(next3);
        painel.add(card4, "Pergunta 3");

        //criar card 5, quarta pergunta
        JPanel card5 = new JPanel();
        JButton next4 = new JButton("Next");
        card5.add(new JLabel("Quem anotou mais pontos em apenas um jogo no seculo 21?"));
        card5.add(new JLabel("Kobe Bryant, Lebron James ou Jordan"));
        card5.add(new JTextField());
        card5.add(next4);
        painel.add(card5, "Pergunta 4");

        //criar card 6, quinta pergunta
        JPanel card6 = new JPanel();
        JButton next5 = new JButton("Next");
        card6.add(new JLabel("Qual jogador tem mais titulos na NBA?"));
        card6.add(new JLabel("Bill Russel, Karem AbduJabbar ou Michael Jordan"));
        card6.add(new JTextField());
        card6.add(next5);    
        painel.add(card6, "Pergunta 5");

        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        next.addActionListener(e->{
            cl.show(painel, "Pergunta 1"); 
        });

        next1.addActionListener(e->{
            cl.show(painel, "Pergunta 2");
        });

        next2.addActionListener(e->{
            cl.show(painel, "Pergunta 2");
        });

        next3.addActionListener(e->{
            cl.show(painel, "Pergunta 2");
        });

        next4.addActionListener(e->{
            cl.show(painel, "Pergunta 2");
        });

        next5.addActionListener(e->{
            cl.show(painel, "Pergunta 2");
        });
    }
}
