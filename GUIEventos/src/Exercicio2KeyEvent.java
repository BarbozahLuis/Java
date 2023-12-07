import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Exercicio2KeyEvent extends JFrame{
    //atributos
    private JPanel mainPanel;
    private JLabel letraDigitada;
    private JTextField caixaDigitacao;
    private JLabel textoDigitado;
    //construtor
    public Exercicio2KeyEvent() {
        super("Exercicio 2");
        this.setBounds(100, 100, 400, 250);
        //Add painel principal -> GridLayout
        mainPanel = new JPanel(new GridLayout(4,1));//4 linhas e 1 coluna
        this.add(mainPanel);
        //add componentes
        letraDigitada = new JLabel("a letra digitada é: ");
        mainPanel.add(letraDigitada);
        mainPanel.add(new JLabel("Digite seu texto aqui: "));
        caixaDigitacao = new JTextField();
        mainPanel.add(caixaDigitacao);
        textoDigitado = new JLabel();
        mainPanel.add(textoDigitado);

        //criar o tratamento de eventos
        Handler evt = new Handler();
        caixaDigitacao.addKeyListener(evt);

    }
    public class Handler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char teclaApertada = e.getKeyChar();
            letraDigitada.setText("A letra digitada é: "+ teclaApertada);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            //não vou usar
        }

        @Override
        public void keyReleased(KeyEvent e) {
            textoDigitado.setText(caixaDigitacao.getText());
        }

    }
}
