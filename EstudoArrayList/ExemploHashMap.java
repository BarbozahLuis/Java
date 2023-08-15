package EstudoArrayList;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    HashMap <String,String> capitalEstados = new HashMap<>();
    //método
    public void teste() {
        capitalEstados.put("SP", "São Paulo");
        capitalEstados.put("MG", "Belo Horizonte");
        capitalEstados.put("RJ", "Rio de Janeiro");
        capitalEstados.put("ES", "Vitória");
        boolean jogo = true;
        while (jogo) {
           String Estado = JOptionPane.showInputDialog("Digite a sigla do estado");
            JOptionPane.showMessageDialog(null, capitalEstados.get(Estado));
        }
        
    }
    
    public void exercicio() {
        HashMap <String, Integer> nome = new HashMap<>(0, 0);
        nome.put("Luis", 23);
        nome.put("Roger", 22);
        nome.put("Ygor", 21);
        for (String idade : nome.keySet()) {
            JOptionPane.showMessageDialog(null, "Nome: "+ nome + "," + nome.get(idade));
        }
        
    }
}
