package VetoresArray;

import java.util.Scanner;

public class Vetores {
    Scanner sc= new Scanner (System.in);
    public void exemplo1(){
        //criando um vetor
        double[] valores = new double[]{10.5,20.7, 30.6,40,4};
        System.out.println("1º Posição- Índice[0]:"+valores[0]);
        System.out.println("2º Posição- Índice[1]:"+valores[1]);
        System.out.println("3º Posição- Índice[2]:"+valores[2]);
        System.out.println("4º Posição- Índice[3]:"+valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; //Mudando o valor do Índice[0]
        System.out.println("1º Posição- Índice[0]"+valores[0]);
    }
    public void exemplo2(){
        // criando um vetor
        int valoresInt[] = new int[6];
        System.out.println("Digite 6 Nº inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        valoresInt[5]=sc.nextInt();
        System.out.println("1º Posição- Índice[0]:"+valoresInt[0]);
        System.out.println("2º Posição- Índice[1]:"+valoresInt[1]);
        System.out.println("3º Posição- Índice[2]:"+valoresInt[2]);
        System.out.println("4º Posição- Índice[3]:"+valoresInt[3]);
        System.out.println("5º Posição- Índice[4]:"+valoresInt[4]);
        System.out.println("6º Posição- Índice[5]:"+valoresInt[5]);
    }
    public void exercicio2(){
        //criando um vetor
        double valores2 [] = new double[10];
        System.out.println("Digite 10 Nº reais");
        valores2[0]=sc.nextDouble();
        valores2[1]=sc.nextDouble();
        valores2[2]=sc.nextDouble();
        valores2[3]=sc.nextDouble();
        valores2[4]=sc.nextDouble();
        valores2[5]=sc.nextDouble();
        valores2[6]=sc.nextDouble();
        valores2[7]=sc.nextDouble();
        valores2[8]=sc.nextDouble();
        valores2[9]=sc.nextDouble();
        System.out.println("10º Posição- Índice[0]:"+valores2[9]);
        System.out.println("9º Posição- Índice[1]:"+valores2[8]);
        System.out.println("8º Posição- Índice[2]:"+valores2[7]);
        System.out.println("7º Posição- Índice[3]:"+valores2[6]);
        System.out.println("6º Posição- Índice[4]:"+valores2[5]);
        System.out.println("5º Posição- Índice[5]:"+valores2[4]);
        System.out.println("4º Posição- Índice[6]:"+valores2[3]);
        System.out.println("3º Posição- Índice[7]:"+valores2[2]);
        System.out.println("2º Posição- Índice[8]:"+valores2[1]);
        System.out.println("1º Posição- Índice[9]:"+valores2[0]);
    }
    public void exemplo3(){
        double notas[] = new double[4];
        System.out.println("Digite as  4 notas do aluno");
        notas[0]=sc.nextDouble();
        notas[1]=sc.nextDouble();
        notas[2]=sc.nextDouble();
        notas[3]=sc.nextDouble();
        double media=(notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("A média é"+media);
    }
}
