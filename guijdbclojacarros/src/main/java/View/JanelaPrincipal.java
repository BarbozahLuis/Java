package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        CarrosPainel tab1 = new CarrosPainel();
        jTPane.add("Carros", tab1);

        VendasView venda = new VendasView();
        jTPane.add("Vendas", venda);
        
        CadastroDeClientes cadastro = new CadastroDeClientes();
        jTPane.add("Cadastro", cadastro);
       
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jTPane.addChangeListener(e->{
            venda.atualizarComboBox();
        });
    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }
}