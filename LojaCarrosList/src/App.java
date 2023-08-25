import java.util.*;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        //list
        List <Carros> listaCarros = new ArrayList<>();
        boolean aberto = true;
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro\n2 - Listar\n3 - Consultar carro\n4 - Apagar carro"));
            if(acao == 1){//cadastrar carros na lista
                //criar um objeto
                String marcaCar = JOptionPane.showInputDialog("Digite a marca do carro");
                String modeloCar = JOptionPane.showInputDialog("Digite o modelo do carro");
                String anoCar = JOptionPane.showInputDialog("Digite o ano do carro");
                String corCar = JOptionPane.showInputDialog("Digite a cor do carro");
                Carros car = new Carros(marcaCar, modeloCar, anoCar, corCar);
                listaCarros.add(car);
            }else if(acao == 2){//listar os carros cadastrados
                String listar = " ";
                for (Carros carros : listaCarros) {
                    listar +=carros.imprimirLN();
                }
                JOptionPane.showMessageDialog(null, listar);
            }else if(acao == 3){
                
                String consulta = JOptionPane.showInputDialog("Digite o modelo desejado");
                String lista = " ";
                for (Carros carros : listaCarros) {
                    if(carros.getModelo().equals(consulta)){
                        lista +=carros.imprimirLN();
                }
                JOptionPane.showMessageDialog(null, lista);
                }
                
            }else if(acao == 4){
                String apagar = JOptionPane.showInputDialog("Digite o modelo do veículo que deseja remover");
                int i = 0;
                int valor=0;
                for (Carros carros : listaCarros) {
                
                    if(carros.getModelo().equals(apagar)){
                        valor=i;
                    }
                    i++;
                    listaCarros.remove(valor);
                }
            }
        }//aberto = false;
        //1. cadastrar carro
        //2. listar os carros
        //3. consultar carro 
        //4. apagar carro
    }
}
