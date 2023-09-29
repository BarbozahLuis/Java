
import java.awt.CardLayout;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio33 extends JFrame {
    public Exercicio33() {
        super("Pagina principal");
        // painel principal
        JPanel painel = new JPanel();
        CardLayout cl = new CardLayout();// card layout serve pra mudarmos uma pagina para outra, e ele mostra apenas o
                                         // primeiro card, mas tendo a possibilidade de trocar e nao de mostrar dois ao
                                         // mesmo tempo
        painel.setLayout(cl);// quer dizer q o card faz parte do painel
        // add o painel principal ao frame
        this.add(painel);
        // criando card 1
        JPanel card1 = new JPanel();
        // texto card 1
        card1.add(new JLabel("Tela inicial - seja bem vindo"));
        // criar botão no card 1
        JButton botao1 = new JButton("Login");
        JButton botao2 = new JButton("Registro");
        JButton botao3 = new JButton("Inicio");
        // adicionando os botões ao card1
        card1.add(botao1);
        card1.add(botao2);
        // adicionando o card1 ao painel
        painel.add(card1, "Inicio");

        // criando card 2
        JPanel card2 = new JPanel();
        // texto card 2
        card2.add(new JLabel("Seja bem vindo, faça seu login"));

        // adicionando os botões ao card1
        card2.add(botao3);
        card2.add(botao2);
        // adicionando o card1 ao painel
        painel.add(card2, "Login");

        // criando card 3
        JPanel card3 = new JPanel();
        // texto card 3
        card3.add(new JLabel("Seja bem vindo - faça seu registro"));
        // criar botão no card 1
        // adicionando os botões ao card1
        card3.add(botao3);
        card3.add(botao1);
        // adicionando o card1 ao painel
        painel.add(card3, "Registro");

        // set do frame
        this.setDefaultCloseOperation(2);// define a função do "x" da janela no caso para que quando fechar, encerre o
                                         // programa
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // criar as ações para os botões
        // "show" é um metodo do cardlayout que possibilita sair de um card para o
        // outro, apenas puxando o nome que vc colocou no card q foi adicionado no
        // painel ex: painel.add(card3,"Inicio");
        botao1.addActionListener(e -> {
            cl.show(painel, "Login");
        });
        botao2.addActionListener(e -> {
            cl.show(painel, "Registro");
        });
        botao3.addActionListener(e -> {
            cl.show(painel, "Inicio");
        });

    }
}
