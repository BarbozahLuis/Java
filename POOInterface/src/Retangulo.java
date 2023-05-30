package POOInterface.src;

public class Retangulo implements FigurasGeometricas{
    int base;
    int altura;
    //gets and sets
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    //contrutor com parâmetros e ele sempre tem o mesmo nome da classe
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        int area = base*altura;
        return area;
    }
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retangulo";
    }
    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro = (base+altura)*2;
        return perimetro;
    }

    
    
}
