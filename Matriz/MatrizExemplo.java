package Matriz;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.text.html.FormView;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    /**
     * 
     */
    public void exemplo1() {
        // gerar preencher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9];// bidimensional 10x9
        // preencher minha matriz
        for (int i = 0; i < matriz.length; i++) {// 1º dimensão//linha
            for (int j = 0; j < matriz[0].length; j++) {// 2º dimensão//coluna
                // System.out.println("matriz["+i+"] ["+j+"]=");
                matriz[i][j] = rd.nextInt(10);

            }

        }
        //imprimir elemento por elemento da minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "] [" + j + "]="+matriz[i][j]);

            }
        }
        // imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
           System.out.println("|");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("|");
        }
        int somaLinha = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz [3][i]; 
        }
        System.out.println("++++++++++++++++");
        System.out.println(" A soma da Linha 4 é"+somaLinha);

        //somas todos os elementos da 4ª coluna
        int somaColuna = 0;
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz [i][3];
        }
        System.out.println("++++++++++++++++++");
        System.out.println(" A soma da Coluna 4 é"+somaColuna);
    }
    /**
     * 
     */
    public void exemplo2(){
        //imprimir uma matriz identidade (diagonal igual a 1)
        int matriz [][] = new int [5][5];//criei uma matriz 5x5
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                //se i==j matriz[i][j]=1
                if(i==j){//diagonal principal
                    matriz[i][j]=1;
                }
                else{//d+ numeros
                    matriz[i][j]=0;
                }
            }
        }
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
             for (int j = 0; j < matriz[0].length; j++) {
                 System.out.print(matriz[i][j]+" ");
             }
             System.out.println("|");
         }
    }
    public void exemplo3(){
        int matriz [][] = new int [4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= rd.nextInt(10);
            }
        }

        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
             for (int j = 0; j < matriz[0].length; j++) {
                 System.out.print(matriz[i][j]+" ");
             }
             System.out.println("|");
         }

         System.out.println("+++++++++++");

         //impressao da matriz transposta
         for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
             for (int j = 0; j < matriz[0].length; j++) {
                 System.out.print(matriz[j][i]+" ");
             }
             System.out.println("|");
         }
         //b. somar todos os itens da diagonal principal(i=j)
         int soma=0;
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //somar os itens somente da diagonal principal
                if(i==j){
                    soma+=matriz[i][j];
                }
            }
         }
         System.out.println(" A soma da diagonal principal é"+soma);
    }

}
