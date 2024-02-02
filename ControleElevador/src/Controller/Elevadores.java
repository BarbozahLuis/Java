package Controller;

public class Elevadores extends Thread {
    private int currentFloor;
    private int[] floorQueue;
    private boolean running;

    public Elevadores() {
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

    public void moveElevator(int destinationFloor) {
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

    private void updateStatusLabel(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStatusLabel'");
    }
}