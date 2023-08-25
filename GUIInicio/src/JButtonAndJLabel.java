import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonAndJLabel {//não vou usar extends pois não quero utilizar um frame e sim criar o frame dentro dela
    //atributos
    int cont;
    //construtor
    public JButtonAndJLabel() {
        //criar um JFrame - Janela básica para uma aplicação
        
        //criar um objeto janela da classe JFrame
        JFrame janela = new JFrame("Janela Principal"); //criando um objeto/ dentro do () será o nome da janela
        
        //criar um obejto painel da classe JPanel
        JPanel painel = new JPanel();//Painel(container)
        
        //adicionar o painel ao frame
        janela.getContentPane().add(painel);//utilizado para fixar os elementos que serão adicionados no painel ele só tera caracteristica do painel e o da janela com o da janela
        
        //Criar Componentes
        JButton button = new JButton("Clique Aqui");
        JLabel text = new JLabel("Nº de Cliques");

        //adicionar os componentes so painel
        painel.add(button);
        painel.add(text);

        //configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //organiza o tamanho da janela de acordo com os elementos
        janela.pack();

        janela.setVisible(true);
        //a cada clique, mostrar o numero de cliques
        //action listener é minha ação para meu botão
        button.addActionListener(e->{
            cont++;
            text.setText("Nº de cliques "+cont);
            //a cada clique, criar um button
            painel.add(new JButton(""+cont));
            janela.pack();
            
        });
        
    
    
    
    }
    
}
