package View;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import Connection.CarrosDAO;
import Model.Carros;

public class VendasView extends JPanel{
    JComboBox<String> carrosComboBox;
    List<Carros> carros;

    public VendasView() {
        super();
        carrosComboBox = new JComboBox<>();
        //preencha o JComboBox com os carros
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca() + " " + carro.getModelo() + " " + carro.getPlaca());
        }
        add(carrosComboBox);
    }
    public void atualizarComboBox(){
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.removeAllItems();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(carro.getMarca() + " " + carro.getModelo() + " " + carro.getPlaca());
        }
    }
}
