package POOExercicio2;

import java.util.Random;
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Random rd = new Random(0);
        Scanner sc = new Scanner(System.in);
        // vetor de objetos
        Agenda pessoas[] = new Agenda[10]; // pessoas = vetor/array e foi determinado o seu tamanho
        // preencher o meu vetor/array
        for (int i = 0; i < pessoas.length; i++) {// fori para preencher as 10 posições dos vetores {
            // construtor de objetos
            pessoas[i] = new Agenda();
            // preencher os atributos
            //pessoas[i].setNome(sc.next())
            pessoas[i].setNome("Pessoa" + i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i + 18);
        }
        // buscador
        // enquanto nomeDigitado != nome do Objeto
        // cont e procure
        int cont = 0;
        boolean teste=true;
        String nomeDigitado = sc.next();// scanner ou JOptionPane
        while (!nomeDigitado.equalsIgnoreCase(pessoas[cont].getNome())) //equals é pra comparar string
        {   

            cont++;
        }
        System.out.println("Nome: " + pessoas[cont].getNome() + "Idade: " + pessoas[cont].getIdade() + "Altura: "
                + pessoas[cont].getAltura());
    }
}
