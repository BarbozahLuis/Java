package POOExercicio1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar objeto
        Pessoa pessoa1 = new Pessoa();//construtor vazio
        //chamei os métodos
        pessoa1.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa1.setNome("Fabiana");
        pessoa1.setAltura(1.67);
        pessoa1.setDiaNascimento(28);
        pessoa1.setMesNascimento(3);
        pessoa1.setAnoNascimento(1997);
        pessoa1.imprimir();
        System.out.println("Idade"+pessoa1.getIdade());
    }
}
