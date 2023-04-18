package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);
   
    public void exemplo1(){
        for(int i=0;i<10;i++){ // variavel "i=0" quando declarada dentro do parentese ela apenas funciona dentro do laço

        System.out.println("o nº da iteração é"+i);
    }
}
public void exemplo2(){
    int vetor[]=new int[10];//criando o vetor 10 posições
    //preencher o vetor com fori
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("vetor ["+i+"]=");
        vetor[i]=sc.nextInt();
    }
    //imprimir o vetor na ordem inversa
    for(int i=9; i>=0;i--){
        System.out.println("vetor["+i+"]="+vetor[i]);
    }
}
    public void exemplo3(){
        //carrinho de compra
        double carrinhoCompra[]=new double[]{19.90, 35.70, 56,80, 97.50};
        //finalizar a compra
        double valorFinal=0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            //imprimir valor parcial
            System.out.println("valor parcial da compra: R$"+valorFinal);
            
        }
        //mostrar valor final da compra
        System.out.println("o valor da compra é R$"+valorFinal);
    }
    public void exemplo4(){
        //ler 4 notas e mostrar as 4 e a média
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota"+(i+1)+":");
            vetorNotas[i]=sc.nextDouble();
        }
        //imprimir as 4 notas e calcular a media
        double mediaNotas=0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas+=vetorNotas[i];
            System.out.println("A "+(i+1)+"a Nota é"+vetorNotas[i]);
        }
        mediaNotas/=vetorNotas.length;
        System.out.printf("A media do aluno é % 2.f"+mediaNotas);
    }
    public void exemplo5(){
        //ler 4 notas de 10 alunos
        //vetor para guardar as medias
        double vetorMedia[]=new double [3];
        //preencher o vetor de medias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas=0;
            for(int j=0;j<4;j++){
                System.out.println("Nota "+(j+1)+ "aluno "+(i+1));
                notas+=sc.nextDouble();
            }
            notas/=4;
            vetorMedia[i]=notas;
        }
        //imprimir notas >= 7 do vetor medias
        for (int i = 0; i < vetorMedia.length; i++) {
            if(vetorMedia[i]>=7)
            System.out.println("a media do aluno "+(i+1)+"é "+vetorMedia[i]);
        }
    }
}