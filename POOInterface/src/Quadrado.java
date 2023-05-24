package POOInterface.src;

public class Quadrado implements FigurasGeometricas { // quando é utilizado interface é utilizado implements
    int lados;// aqui é colocado os atributos

    public Quadrado(int lados) {// aqui são os paramentos
        this.lados = lados;
    }
    //sets and gets
    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    //métodos da classe FigurasGeometricas(interface)
    @Override // posso modificar mas nao remover
    public double getArea() {
        // TODO Auto-generated method stub
        int area = lados * lados;
        return area;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro = 4 * lados;
        return perimetro;
    }

}
