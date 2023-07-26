package RevisaoPOO;

import java.util.Scanner;

import javax.swing.JOptionPane;

import RevisaoPOO.Cadastro.Animal;
import RevisaoPOO.Cadastro.Cachorro;
import RevisaoPOO.Cadastro.Gato;
import RevisaoPOO.Cadastro.Outro;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal bicho = new Animal();
        Cachorro dog1 = new Cachorro();
        Gato cat1 = new Gato();
        Outro other = new Outro();

        boolean inicio = true;
        while (inicio) {
        
        int acao1 = Integer.parseInt(
                JOptionPane.showInputDialog("Bem Vindo ao BlackPet" + "\nEscolha a ação desejada de acordo com seu Pet"
                        + "\n 1 para Cachorro" + "\n2 para gatos" + "\n3 para Outras espécies"));
        if(acao1 == 1){
            bicho.setEspecie(JOptionPane.showInputDialog("Digite a espécie do seu animal: "));
            bicho.setNome(JOptionPane.showInputDialog("Digite o nome do seu Pet: "));
            bicho.setPeso(JOptionPane.showInputDialog("Digite o peso do seu Pet"));

            }

        }
        


        }
    }
