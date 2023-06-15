package Projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Projeto.Pessoas.ContaPF;
import Projeto.Pessoas.ContaPJ;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criar vetor para armazenar quantidade de contas poderão ser armazenada
        ContaPJ clientePJ[] = new ContaPJ[10];
        ContaPF clientePF[] = new ContaPF[10];
        // começar meu banco
        
        
        int contPJ = 0;
        int contPF = 0;
        boolean inicio = true;
        while (inicio) {
            int acao0 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1-Acessar Conta PJ"
                    + "\n 2-Acessar Conta PF"));

            if (acao0 == 1) {
                boolean aberto = true;
                while (aberto) {

                    int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                            + "\n 1-Abrir Conta PJ"
                            + "\n 2-Acessar Conta PJ"
                            + "\n 3-Sair"));
                    if (acao1 == 1) {// abrir a conta PJ
                        // criar um objeto
                        clientePJ[contPJ] = new ContaPJ();// chamei o contrutor
                        // preencher os atributos do objeto
                        clientePJ[contPJ].setNomeConta(JOptionPane.showInputDialog("Informe o nome da empresa:"));
                        clientePJ[contPJ].setCnpj(JOptionPane.showInputDialog("Informe o CNPJ da empresa"));
                        clientePJ[contPJ].setnConta(1000+contPJ);
                        clientePJ[contPJ].setSaldo(0);
                        // acrescimo no contador
                        JOptionPane.showMessageDialog(null, "Conta Criada com sucesso");
                        contPJ++;
                    } else if (acao1 == 2) {// acessar uma conta já criada
                        // localizar a conta no vetor
                        int i;// contador
                        int nContaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                        for (i = 0; i < clientePJ.length; i++) {
                            if (nContaBuscada == clientePJ[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                break;
                            }
                        }

                        // menu de acesso da conta
                        boolean acesso = true;
                        while (acesso) { // acessei a conta
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                    + "\n 1-Consultar o saldo"
                                    + "\n 2-Realizar um Saque"
                                    + "\n 3-Realizar um depósito"
                                    + "\n 4-Realizar um empréstimo"
                                    + "\n 5-Sair da Conta"));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null,"Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                            }else if(acao2==2){
                                clientePJ[i].saque();
                            }else if(acao2==3){
                                clientePJ[i].deposito();
                            }else if(acao2==4){
                                clientePJ[i].emprestimoPJ();
                                JOptionPane.showMessageDialog(null,"Valor Aprovado" + clientePJ[i].getEmprestimoPJ());
                                JOptionPane.showMessageDialog(null, "Valor a ser pago é: " + clientePJ[i].getValorPagarPJ());
                            }else if(acao2==5){
                                acesso = false;
                            }else{
                                JOptionPane.showMessageDialog(null, "Digite uma operação válida");
                            }
                        }
                    }else{
                        aberto = false;
                    }
                }
            } else if (acao0 == 2) {
                boolean aberto = true;
                while (aberto) {

                    int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                            + "\n 1-Abrir Conta PF"
                            + "\n 2-Acessar Conta PF"
                            + "\n 3-Sair"));
                    if (acao == 1) {// abrir a conta PF
                        // criar um objeto
                        clientePF[contPF] = new ContaPF();// chamei o contrutor
                        // preencher os atributos do objeto
                        clientePF[contPF].setNomeConta(JOptionPane.showInputDialog("Informe seu nome completo:"));
                        clientePF[contPF].setCpf(JOptionPane.showInputDialog("Informe seu CPF"));
                        clientePF[contPF].setnConta(2000 + contPF);
                        clientePF[contPF].setSaldo(0);
                        // acrescimo no contador
                        JOptionPane.showMessageDialog(null, "Conta Criada com sucesso");
                        contPF++;
                    } else if (acao == 2) {// acessar uma conta já criada
                        // localizar a conta no vetor
                        int i;// contador
                        int nContaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                        for (i = 0; i < clientePF.length; i++) {
                            if (nContaBuscada == clientePF[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                break;
                            }
                        }

                        // menu de acesso da conta
                        boolean acesso = true;
                        while (acesso) { // acessei a conta
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                    + "\n 1-Consultar o saldo"
                                    + "\n 2-Realizar um Saque"
                                    + "\n 3-Realizar um depósito"
                                    + "\n 4-Realizar um empréstimo"
                                    + "\n 5-Sair da Conta"));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            }else if(acao2==2){
                                clientePF[i].saque();
                            }else if(acao2==3){
                                clientePF[i].deposito();
                            }else if(acao2==4){
                                clientePF[i].emprestimoPF();
                                JOptionPane.showMessageDialog(null,"Valor Aprovado" + clientePF[i].getEmprestimoPF());
                                
                                JOptionPane.showMessageDialog(null, "Valor a ser pago é: " + clientePF[i].getValorPagar());
                            }else if(acao2==5){
                                acesso = false;
                            }else{
                                JOptionPane.showMessageDialog(null, "Digite uma operação válida");
                            }

                        }
                    }else{
                         aberto = false;
                    }
                }
            }else{inicio = false;}
        }
    }
}
