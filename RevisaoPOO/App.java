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
        Animal bicho = new Animal();
        Cachorro dog1 = new Cachorro();
        Gato cat1 = new Gato();
        Outro other = new Outro();

        boolean inicio = true;
        while (inicio) {
            JOptionPane.showMessageDialog(null, "Bem Vindo ao BlackPet");
            int acao1 = Integer.parseInt(
                    JOptionPane
                            .showInputDialog("\nEscolha a ação desejada de acordo com seu Pet"
                                    + "\n1 - Cachorro" + "\n2 - gatos" + "\n3 - Outras espécies"));
            if (acao1 == 1) {
                dog1.setNome(JOptionPane.showInputDialog("Digite o nome do seu Pet:"));
                dog1.setPeso(JOptionPane.showInputDialog("Digite o peso do seu Pet:"));
                dog1.setProprietario(JOptionPane.showInputDialog("Digite seu Nome:"));
                dog1.setRaça(JOptionPane.showInputDialog("Digite a Raça de seu cachorro"));
                dog1.setCastrado(JOptionPane.showInputDialog("Castrado? (Sim ou Não)"));
                JOptionPane.showMessageDialog(null, "Ficha preenchida com sucesso!" + "\n" + bicho.getNome() + "\n"
                        + bicho.getPeso() + "\n" + bicho.getProprietario() + "\n" + dog1.getCastrado());
            } else if (acao1 == 2) {
                cat1.setNome(JOptionPane.showInputDialog("Digite o nome do seu Pet:"));
                cat1.setPeso(JOptionPane.showInputDialog("Digite o peso do seu Pet:"));
                cat1.setProprietario(JOptionPane.showInputDialog("Digite seu nome completo:"));
                cat1.setRaça(JOptionPane.showInputDialog("Digite a Raça de seu cachorro"));
                cat1.setCastrado(JOptionPane.showInputDialog("Castrado? (Sim ou Não)"));
                JOptionPane.showMessageDialog(null, "Ficha preenchida com sucesso!" + "\n" + bicho.getNome() + "\n"
                        + bicho.getPeso() + "\n" + bicho.getProprietario() + "\n" + cat1.getCastrado());
            }else if(acao1 == 3){
                other.setNome(JOptionPane.showInputDialog("Digite o Nome de seu Pet:"));
                other.setEspecie(JOptionPane.showInputDialog("Digite a espécie de seu Pet:"));
                other.setRaça(JOptionPane.showInputDialog("Digite a raça de seu Pet:"));
                other.setProprietario(JOptionPane.showInputDialog("Digite seu nome completo"));
                JOptionPane.showMessageDialog(null, "Ficha preenchida com sucesso!" + "\n" + other.getNome() + "\n"
                        + other.getEspecie() + "\n" + other.getRaça() + "\n" + other.getProprietario());
            }

            else {
                inicio = false;
            }

        }

    }
}
