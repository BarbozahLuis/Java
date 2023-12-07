import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploNomeSobrenome extends JFrame { // jframe é uma biblioteca de janelas
    //atributos
    //private funciona apenas dentro da classe
    private JLabel texto;
    private JTextField caixaNome;
    private JTextField caixaSobrenome;
    public ExemploNomeSobrenome() {
        super("Nome Sobrenome");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        // criar um painel -. gridlayout 3x2
        JPanel mainPanel = new JPanel(new GridLayout(3, 2));// painel principal com 3 linhas e 2 colunas
        // criar os componentes do painel
        mainPanel.add(new JLabel("Nome: "));
        caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Sobrenome: "));
        caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("Concatenar");
        mainPanel.add(botao);
        texto = new JLabel();
        mainPanel.add(texto);
        // set do frame
        this.add(mainPanel);
        this.setVisible(true);
        // tratamento de eventos
        // 1º forma : e->
        // botao.addActionListener(e->{//ouvinte é o metedo relacionado ao botão
        // evento
        // texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText()); //aqui ele
        // vai pegar o texto que esta no nome e o texto que esta no sobrenome e juntar
        // caixaNome.setText("");
        // caixaSobrenome.setText("");

        // });
        // 2ª forma -
        // botao.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // evento
        // texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        // caixaNome.setText("");
        // caixaSobrenome.setText("");
        // }
        // });
        // 3ª forma - Handler
        // importa a classe handler -> botão
            Handler evt = new Handler();
        botao.addActionListener(evt);
    }
    
        public class Handler implements ActionListener{ //implements obriga a nos utilizar algum metodo
            @Override
            public void actionPerformed(ActionEvent e){
                texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
                caixaNome.setText("");
                caixaSobrenome.setText("");
            }
        }
}
