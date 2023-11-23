package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.CarrosDAO;
import Model.Carros;

public class CarrosControl {
    // atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public CarrosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos do modelo CRUD
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),
                    carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        try {
            int anoInt = Integer.parseInt(ano);

            if (anoInt < 1950 || anoInt > 2025) {
                JOptionPane.showMessageDialog(null, "Valor do ano incorreto, digite novamente entre 1950 e 2025");
            } else if (!placa.matches("[A-Z]{3}\\d{4}")) {
                JOptionPane.showMessageDialog(null, "Placa invalida. Insira o valor correto: AAA1234");
            } else if (!marca.matches("[a-zA-Z]")) {
                JOptionPane.showMessageDialog(null, "Marca invalida. Não é permitido numeros neste campo");
            } else if (!valor.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Valor invalido. Não é permitido letras neste campo");
            } else {
                new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
                // Chama o método de cadastro no banco de dados
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
                atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano invalido. Insira o valor correto");
        }

    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {
        new CarrosDAO().apagar(placa);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }

}