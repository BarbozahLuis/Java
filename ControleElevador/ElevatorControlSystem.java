import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElevatorControlSystem extends JFrame {
    private JLabel statusLabel;
    private JButton[] floorButtons;
    private Elevator[] elevators;

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

    private void requestElevator(int floor) {
        // Simplesmente escolhe um elevador aleatoriamente e solicita o andar
        int elevatorIndex = (int) (Math.random() * 2);
        elevators[elevatorIndex].addFloorToQueue(floor);
    }

    private class Elevator extends Thread {
        private int currentFloor;
        private int[] floorQueue;
        private boolean running;

        public Elevator() {
            currentFloor = 0;
            floorQueue = new int[10]; // Capacidade máxima de 10 andares na fila
            running = true;
        }

        public void addFloorToQueue(int floor) {
            for (int i = 0; i < floorQueue.length; i++) {
                if (floorQueue[i] == 0) {
                    floorQueue[i] = floor;
                    break;
                }
            }
            
        }

        @Override
        public void run() {
            while (running) {
                // Verifica se há algum andar na fila
                for (int i = 0; i < floorQueue.length; i++) {
                    if (floorQueue[i] != 0) {
                        int destinationFloor = floorQueue[i];
                        floorQueue[i] = 0;
                        moveElevator(destinationFloor);
                    }
                }
                // Espera um pouco antes de verificar a fila novamente
                try {
                    Thread.sleep(2000); // Tempo de espera entre as verificações da fila
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void moveElevator(int destinationFloor) {
            // Simula o movimento do elevador até o andar de destino
            if (currentFloor < destinationFloor) {
                for (int i = currentFloor; i <= destinationFloor; i++) {
                    currentFloor = i;
                    updateStatusLabel("Elevador em movimento para o andar " + i);
                    try {
                        Thread.sleep(1000); // Simula o tempo de movimento entre andares
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                for (int i = currentFloor; i >= destinationFloor; i--) {
                    currentFloor = i;
                    updateStatusLabel("Elevador em movimento para o andar " + i);
                    try {
                        Thread.sleep(1000); // Simula o tempo de movimento entre andares
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            updateStatusLabel("Elevador chegou ao andar " + destinationFloor);
        }

        private void updateStatusLabel(String message) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    statusLabel.setText(message);
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ElevatorControlSystem();
            }
        });
    }
}
