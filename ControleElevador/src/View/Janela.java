package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {
    public ElevatorControlSystem() {
        setTitle("Sistema de Controle de Elevadores"); //titulo da pagina
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //quando fechar a tela o programa será encerrado
        setSize(400, 300); // define o tamanho da janela 
        setLayout(new BorderLayout()); // define o tipo de layout, neste caso o borderlayout, utilizado para organizar os componentes em regiao

        statusLabel = new JLabel("Status: Inicializando...");
        add(statusLabel, BorderLayout.NORTH);

        JPanel floorPanel = new JPanel(new GridLayout(9, 1));
        floorButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            floorButtons[i] = new JButton("Andar " + i);
            int floorNumber = i;
            floorButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    requestElevator(floorNumber);
                }
            });
            floorPanel.add(floorButtons[i]);
        }
        add(floorPanel, BorderLayout.CENTER);

        elevators = new Elevator[2]; // Dois elevadores
        for (int i = 0; i < 2; i++) {
            elevators[i] = new Elevator();
            elevators[i].start();
        }

        setVisible(true);
    }

}
