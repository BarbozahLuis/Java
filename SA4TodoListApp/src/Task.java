public class Task {
    //atributos
    String description;
    boolean done;
    //construtor
    public Task(String description) {
        this.description = description;//descrição da tarefa
        this.done = false;// sempre q criar uma tarefa colocar como falso pois ela ainda nao foi finalizada
    }
    //get and set
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isDone() {//quando é boolean ela cria o "is" pois ela só pode ser verdadeira ou falsa
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}
