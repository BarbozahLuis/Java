package Projeto.Pessoas;

import javax.swing.JOptionPane;

public class Conta {
    String nomeConta;
    int nConta;
    double saldo;
    double deposito;
    double emprestimo;

    //set get
    public String getNomeConta() {
        return nomeConta;
    }
    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int i) {
        this.nConta = i;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
public void saque(){
    double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        saldo -=saque;
}
public void deposito(){
    double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser depositado"));
    saldo +=deposito;
}

}

