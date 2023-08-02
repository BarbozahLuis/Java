package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {

    public static void main(String[] args) {
            String senhaSecreta = "123456";
            String senhaDigitada = JOptionPane.showInputDialog("Informe senha de 6 digitos");
        try{
            if(!senhaDigitada.equals(senhaSecreta)){
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                throw new Exception("Senha invalina");
            }else{
                JOptionPane.showMessageDialog(null, "Senha correta!" + "\nBem vindo!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Digite uma senha com 6 digitos");
        }
        }
}
