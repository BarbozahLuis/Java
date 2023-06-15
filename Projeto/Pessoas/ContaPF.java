package Projeto.Pessoas;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {

    String cpf;
    double emprestimoPF;
    double valorPagar;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getEmprestimoPF() {
        return emprestimoPF;
    }

    public void setEmprestimoPF(double emprestimoPF) {
        this.emprestimoPF = emprestimoPF;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void emprestimoPF() {
        emprestimoPF = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o valor de empréstimo desejado, minimo de R$ 1.000,00 e máximo de R$75.000,00"));
        while (emprestimoPF <= 1000 || emprestimoPF >= 75000) {
            if (emprestimoPF >= 1000 && emprestimoPF <= 75000) {
                saldo += emprestimoPF;
                valorPagar = emprestimoPF * 0.04;
            } else if (emprestimoPF < 1000) {
                JOptionPane.showMessageDialog(null, "Informe um valor acima de 1.000,00");
            } else {
                JOptionPane.showMessageDialog(null, "Informe um valor abaixo de 75.000,00");
            }
        }
    }

}
