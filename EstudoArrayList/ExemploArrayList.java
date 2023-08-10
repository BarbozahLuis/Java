package EstudoArrayList;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    //atributo
    //declarando o ArrayList do Tipo String
    ArrayList<String> carros = new ArrayList<>();
    // metodo
    public void teste() {
        JOptionPane.showInputDialog(null, "Informe um carro");
        //Adicionar Valores ao ArrayList 
        carros.add("Uno");
        carros.add("Palio");
        carros.add("chevette");
        carros.add("Fusca");
        carros.add("Opala");
        //imprimir toda a lista
        System.out.println(carros);
        Collections.sort(carros);
        //pegando o valor correspondente a 5 posição (index: 4)
        System.out.println(carros.get(4 ));
        //percorrer a lista com um FOR
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }Collections.reverse(carros);
        //percorrendo a lisra com o for-each
        for (String i : carros) {
            System.out.println(i);
        }
        carros.clear();
        System.out.println(carros);
    }

    public void exercicio() {
        //criar arraylist do tipo int + 5 valores
        ArrayList<Integer> numero = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numero.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o um número")));
            
        }for (int i : numero) {
            System.out.println(i);
        }Collections.sort(carros);

        
    }
}
