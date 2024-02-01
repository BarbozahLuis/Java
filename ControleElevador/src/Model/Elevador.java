package Model;

public class Elevador {
    //atributos
    private int andarAtual;
    private boolean movimento;

    public Elevador(int andarAtual, boolean movimento){
        this.andarAtual = andarAtual;
        this.movimento = movimento;
    }

    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public boolean isMovimento() {
        return movimento;
    }
    public void setMovimento(boolean movimento) {
        this.movimento = movimento;
    }

    
}
