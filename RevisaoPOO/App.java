package RevisaoPOO;

import java.util.Scanner;

import javax.swing.JOptionPane;

import POOExercicio2.Agenda;
import RevisaoPOO.Cadastro.Animal;
import RevisaoPOO.Cadastro.Cachorro;
import RevisaoPOO.Cadastro.Gato;
import RevisaoPOO.Cadastro.Outro;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Cachorro dog1[] = new Cachorro[10];
        Gato cat1[] = new Gato[10];
        Outro other[] = new Outro[10];
        Agenda agenda[] = new Agenda[10];

        int contCachorro = 0, contGatos = 0, contOutro = 0, contCons = 0;
        boolean inicio = true;

        JOptionPane.showMessageDialog(null, "Bem Vindo ao BlackPet");
        while (inicio) {
            int acao0 = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite: " + "\n1 - Cadastro" + "\n2 - Consulta" + "\n3 - Sair"));

            if (acao0 == 1) {
                int acao1 = Integer
                        .parseInt(JOptionPane.showInputDialog("\nEscolha a ação desejada de acordo com seu Pet"
                                + "\n1 - Cachorro" + "\n2 - Gato" + "\n3 - Outras espécies"));

                if (acao1 == 1) {
                    dog1[contCachorro] = new Cachorro();

                    dog1[contCachorro].setNome(JOptionPane.showInputDialog("Digite o nome do seu Pet:"));
                    dog1[contCachorro].setPeso(JOptionPane.showInputDialog("Digite o peso do seu Pet:"));
                    dog1[contCachorro].setProprietario(JOptionPane.showInputDialog("Digite seu Nome:"));
                    dog1[contCachorro].setRaça(JOptionPane.showInputDialog("Digite a Raça de seu cachorro"));
                    dog1[contCachorro].setCastrado(JOptionPane.showInputDialog("Castrado? (Sim ou Não)"));
                    dog1[contCachorro].setCadastro(1 + contCachorro);
                    JOptionPane.showMessageDialog(null,
                            "Ficha preenchida com sucesso!" + "\nNome do Pet: " + dog1[contCachorro].getNome()
                                    + "\nPeso do Pet: "
                                    + dog1[contCachorro].getPeso() + "\nSeu Nome: "
                                    + dog1[contCachorro].getProprietario()
                                    + "\nCastrado? " + dog1[contCachorro].getCastrado() + "\nNº de cadastro é: "
                                    + dog1[contCachorro].getCadastro());
                    contCachorro++;
                } else if (acao1 == 2) {
                    cat1[contGatos] = new Gato();
                    cat1[contGatos].setNome(JOptionPane.showInputDialog("Digite o nome do seu Pet:"));
                    cat1[contGatos].setPeso(JOptionPane.showInputDialog("Digite o peso do seu Pet:"));
                    cat1[contGatos].setProprietario(JOptionPane.showInputDialog("Digite seu nome completo:"));
                    cat1[contGatos].setRaça(JOptionPane.showInputDialog("Digite a Raça de seu cachorro"));
                    cat1[contGatos].setCastrado(JOptionPane.showInputDialog("Castrado? (Sim ou Não)"));
                    cat1[contGatos].setCadastro(10 + contGatos);
                    JOptionPane.showMessageDialog(null,
                            "Ficha preenchida com sucesso!" + "\nNome do Pet: " + cat1[contGatos].getNome()
                                    + "\nPeso do Pet: "
                                    + cat1[contGatos].getPeso() + "\nSeu Nome: " + cat1[contGatos].getProprietario()
                                    + "\nCastrado? " + cat1[contGatos].getCastrado() + "\nNº de cadastro é: "
                                    + cat1[contGatos].getCadastro());
                    contGatos++;
                } else if (acao1 == 3) {
                    other[contOutro] = new Outro();
                    other[contOutro].setNome(JOptionPane.showInputDialog("Digite o Nome de seu Pet:"));
                    other[contOutro].setEspecie(JOptionPane.showInputDialog("Digite a espécie de seu Pet:"));
                    other[contOutro].setRaça(JOptionPane.showInputDialog("Digite a raça de seu Pet:"));
                    other[contOutro].setProprietario(JOptionPane.showInputDialog("Digite seu nome completo"));
                    other[contOutro].setCadastro(20 + contOutro);
                    JOptionPane.showMessageDialog(null,
                            "Ficha preenchida com sucesso!" + "\nNome do Pet: " + other[contOutro].getNome()
                                    + "\nPeso do Pet: "
                                    + other[contOutro].getEspecie() + "\nSeu Nome: " + other[contOutro].getRaça()
                                    + "\nCastrado? " + other[contOutro].getProprietario());
                    contOutro++;
                }

            } else if (acao0 == 2) {
                JOptionPane.showMessageDialog(null,
                        "Marque sua Consulta! Preencha as informações e confirmamos se temos horário disponivel!");
                boolean aberto = true;
                int nCadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de cadastro"));

                for (int i = 0; i < contCachorro; i++) {
                    if (nCadastro == dog1[contCachorro].getCadastro()) {
                        JOptionPane.showMessageDialog(null,
                                "Seu número de cadastro está correto, clique em 'ok' para prosseguir");
                        aberto = true;
                        break;
                    }
                }
                for (int i = 0; i < contGatos; i++) {
                    if (nCadastro == cat1[contGatos].getCadastro()) {
                        JOptionPane.showMessageDialog(null,
                                "Seu número de cadastro está correto, clique em 'ok' para prosseguir");
                        aberto = true;
                        break;
                    }
                }
                for (int j = 0; j < contOutro; j++) {
                    if (nCadastro == other[contOutro].getCadastro()) {
                        JOptionPane.showMessageDialog(null,
                                "Seu número de cadastro está correto, clique em 'ok' para prosseguir");
                        aberto = true;
                        break;
                    }
                }
                if (aberto) {
                    boolean agendar = true;
                    while (agendar) {
                        String dataAgenda = JOptionPane.showInputDialog("Digite a data desejada: ");
                        String horaAgenda = JOptionPane.showInputDialog("Digite o Horário desejado: ");
                        if (contCons == 0) {
                            agenda[contCons] = new Agenda();
                            agenda[contCons].setData(dataAgenda);
                            agenda[contCons].setHora(horaAgenda);
                            agendar = false;
                        } else {
                            for (int i = 0; i < contCons; i++) {
                                if (agenda[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                                    break;
                                } else {
                                    agenda[contCons] = new Agenda();
                                    agenda[contCons].setData(dataAgenda);
                                    agenda[contCons].setHora(horaAgenda);
                                    agendar = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /*
         * for (int i = 0; i < contGatos; i++) {
         * mensagem.concat(cat1[i].getNome());
         * }
         * JOptionPane.showInputDialog(mensagem);
         */

    }

    }

