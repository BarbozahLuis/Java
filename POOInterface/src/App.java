package POOInterface.src;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        Retangulo figura2 = new Retangulo(4, 6);
        Trapezio figura3 = new Trapezio(5, 6, 3, 2, 7);
        
        System.out.println("Nome: "+figura1.getNomeFigura()+
        "\nArea: "+figura1.getArea()
        +"\nPerimetro: "+figura1.getPerimetro());
        
        System.out.println("Nome: "+figura2.getNomeFigura()+
        "\nArea: "+figura2.getArea()+
        "\nPerimetro: "+figura2.getPerimetro());

        System.out.println("Nome: "+figura3.getNomeFigura()+
        "\nArea: "+figura3.getArea()+
        "\nPerimetro: "+figura3.getPerimetro());
    }
}
