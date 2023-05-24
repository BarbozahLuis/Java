package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // criar uma matriz que sera determinada pelo o usuario
    public void exercicio1() {
        // usuario ira preencher a quantidade de linhas e colunas
        System.out.println("Digite o nº de linhas e em seguida o nº de colunas");
        int matriz[][] = new int[sc.nextInt()][sc.nextInt()];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);

            }
        }//imprimir a matriz da posição I e J
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]" + matriz[i][j]);

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]" + matriz[i][j]);

            }
        }

    }

    public void exercicio2() {
        System.out.println("Digite um palpite");
        int sorteio = rd.nextInt(1000);
        int palpite = sc.nextInt();
        //contador começa em 1 pois ja foi solicitado para o usuario digitar
        int contador = 1;
        while (palpite != sorteio) {

            if (palpite > sorteio) {
                System.out.println("Seu palpite é maior que o nº sorteado");
            }
            if (palpite < sorteio) {
                System.out.println("Seu palpite é menor que o nº sorteado");
            }
            contador++;
           
            System.out.println("Errou, digite um nº novamente");
            palpite =sc.nextInt();
            if (palpite == sorteio) {
                System.out.println("Parabéns, você acertou " + palpite);
            }
        }
        System.out.println("O número de tentativas é"+contador);
    }
    public void exercicio3(){
<<<<<<< HEAD
        int tamanho = rd.nextInt(900)+100;
        int vetor[] = new int[tamanho];
=======
        //int tamanho = rd.nextInt(100,1000);
        int vetor[] = new int[rd.nextInt(100,1000)];
>>>>>>> 8b872dd44f5b7a881cf67b36a6024eb7c51ff0ca
        int contPar = 0;
        int contImpar = 0;
        int contadorPar = 1;
        int contatorImpar=1;
        //preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;

        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            
        }
        for (int i = 0; i < vetor.length; i++) {
            
            if(vetor[i]%2==0){
                System.out.println("Nº pares "+vetor[i]);
            }else{
                System.out.println("Nº impares "+vetor[i]);
            }
        }
        for (int i = 0; i < vetor.length; i+=2) {
            if(vetor[i]%2==0){
                contPar++;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){
                contImpar++;
            }
        }
<<<<<<< HEAD
        System.out.println("Quantidade de numeros pares é"+contPar);
        System.out.println("Quantidade de numeros impares é"+contImpar);
    }   
=======
        System.out.println("A quantidade de Nº pares é "+contPar);
        System.out.println("A quantidade de Nº impares é "+contImpar);
    }
>>>>>>> 8b872dd44f5b7a881cf67b36a6024eb7c51ff0ca
}
