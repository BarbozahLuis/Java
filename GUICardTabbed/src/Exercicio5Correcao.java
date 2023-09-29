import javax.swing.*;

import java.awt.*;

public class Exercicio5Correcao extends JFrame {
    int pont=0;
    public Exercicio5Correcao() {
        super("Exercicio 5 Quiz");
        
        //criar um painel principal
        CardLayout cl = new CardLayout();
        JPanel painel = new JPanel(cl);
        this.add(painel);//add painel ao frame
        //card 1 - tela de inicio 
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Seja bem vindo ao quiz"));
        JButton but1 = new JButton("Start");
        card1.add(but1);
        
        painel.add(card1);

        //pergunta 1
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem venceu a copa de 70"));
        JTextField resposta1 = new JTextField(20);
        card2.add(resposta1);
        JButton but2 = new JButton("Next");
        card2.add(but2);
        
    
        
        painel.add(card2);

        //pergunta 2
        JPanel card3 = new JPanel();
        card3.add(new JLabel("onde foi a copa 70"));
        JTextField resposta2 = new JTextField(20);
        card3.add(resposta2);
        JButton but3 = new JButton("Next");
        card3.add(but3);
    
        
        painel.add(card3);


        //ultimo card com a pontuação
        JPanel card4 = new JPanel();
        card4.add(new JLabel("Obrigado por jogar"));
        JLabel pontFinal = new JLabel("");  
        card4.add(pontFinal);

        JButton but4 = new JButton("jogar");
        card4.add(but4);


        this.setDefaultCloseOperation(2);//define a função do "x" da janela no caso para que quando fechar, encerre o programa
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        but1.addActionListener(e->{
            cl.next(painel);//"next" vai direto para o proximo card e o "show" vc seleciona para qual card deseja ir igual ao exercicio 3
        });

        but2.addActionListener(e->{
            //verificar resposta
            if(resposta1.getText().toLowerCase().equals("brasil")){
                
                pont++;
                
            }
            cl.next(painel);
            resposta1.setText("");
        });

        but3.addActionListener(e->{
            //verificar resposta
            if(resposta2.getText().toLowerCase().equals("mexico")){
                
                pont++;
                
            }
            cl.next(painel);
            resposta2.setText("");
            pontFinal.setText("Sua pontuação foi de: "+pont);
        });

        but4.addActionListener(e->{
            cl.next(painel);//"next" vai direto para o proximo card e o "show" vc seleciona para qual card deseja ir igual ao exercicio 3
        });
        painel.add(card4);
    }
    
}
