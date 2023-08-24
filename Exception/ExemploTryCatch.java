package Exception;



import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        boolean rodando = true;
        while (rodando) {
            JOptionPane.showMessageDialog(null, "Bem vindo a calculadora");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para soma" + "\nDigite 2 para subtração"
                    + "\nDigite 3 para multiplicação" + "\nDigite 4 para divisão"));
            try {

                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n° inteiro: "));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n° inteiro: "));
                if (numero == 1) {

                    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + (numero1 + numero2));
                    
                }

                else if (numero == 2) {

                    JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + (numero1 - numero2));
                    
                } else if (numero == 3) {

                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + (numero1 * numero2));
                    
                } else if (numero == 4) {
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (numero1 / numero2));
                    
                }else{
                    rodando = false;
                }
                 // erro especifico de formato de numero
            } catch (NumberFormatException e) {
               
                JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao é um numero inteiro!"+ "\n Digite novamente!");
                //erro especifico referente a operação por não dividir por zero
            } catch (ArithmeticException e2) {
                JOptionPane.showMessageDialog(null, "Não existe divisão por zero"
                        + "\nDigite novamente");
                        //erro geral
            }  catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Aconteceu um erro"
                        + "\nDigite novamente");
        }}
    }
}