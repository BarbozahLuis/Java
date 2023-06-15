package Projeto.Pessoas;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {

    String cpf;
    double emprestimoPF;
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void emprestimo(){
        double emprestimoPF = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de empréstimo desejado, minimo de R$ 1.000,00 e máximo de R$75.000,00"));
        saldo +=emprestimoPF;
    }

}
