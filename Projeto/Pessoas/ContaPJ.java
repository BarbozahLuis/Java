package Projeto.Pessoas;

import javax.swing.JOptionPane;

public class ContaPJ extends Conta {
    String cnpj;
    double emprestimoPJ;
    double juros = 0.4;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getEmprestimoPJ() {
        return emprestimoPJ;
    }

    public void setEmprestimoPJ(double emprestimoPJ) {
        this.emprestimoPJ = emprestimoPJ;
    }

    public void emprestimoPJ() {
        double emprestimoPJ = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o valor de empréstimo desejado. Valor minimo de R$12.000,00 e valor máximo de R$150.000,00"));

        if (emprestimoPJ >= 12000 && emprestimoPJ <= 15000) {
            double valorTotal = emprestimoPJ * 0.004;
            emprestimoPJ = valorTotal;
        }
        saldo += emprestimoPJ;
    }
}
