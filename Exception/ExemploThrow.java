package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {

    public static void main(String[] args) {
            String senhaSecreta = "123456";
            String login = JOptionPane.showInputDialog("Informe login");
            String dataNascimento = JOptionPane.showInputDialog("Informe data nascimento [dd/mm/aa]");
            String senhaDigitada = JOptionPane.showInputDialog("Informe senha de 6 digitos");
            
            dataNascimento = dataNascimento.replace("/", "");
            
        try{
            if(senhaDigitada.length()!=6) {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                throw new Exception("Senha não tem 6 digitos");
            }if(login.equals(senhaDigitada)){
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                throw new Exception("Senha não pode ser identica ao login");
            }if(senhaDigitada.equals(dataNascimento)){
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                throw new Exception("Senha não pode ser identica a data de nascimento");
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha correta!" + "\nBem vindo!");
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
}
