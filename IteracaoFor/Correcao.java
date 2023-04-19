package IteracaoFor;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Correcao {
    Scanner sc = new Scanner(System.in);
    // criar um vetor de 5 numero e imprimir
    public void Exercicio1(){
        //criar um vetor de 5 posições
        int vetor[]=new int[5];
        //preencher o vetor "for" sempre será declarado o repetidor (i=0)
        for (int i = 0; i < vetor.length; i++) {
            //solicitar para o usuario escrever o nº
            System.out.print("Informe o valor do vetor["+i+"]=");
            //ler o valor digitado e atribuir a posição do vetor
            vetor[i]=sc.nextInt();

        } 
        //imprimit o vetor for
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+1+"]="+vetor[i]);
        }  
    }
    //vetor decimal de 10 posições e imprimir na ordem inversa
    public void Exercicio2(){
        double vetor[]=new double[10];//vetor de 10 posições
        //preencher vetor
        for (int i = 0; i < vetor.length; i++) {
            //solicitar para o usuario escrever o nº
            System.out.println("informe o valor do vetor["+i+"]=");
            //ler o valor digitado e atribuir a posição do vetor
            vetor[i]=sc.nextDouble();
        }
        //imprimir o vetor na ordem inversa indice 0-9
        for(int i=9;i>=0;i--){
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
    //ler 4 notas e calcular a media
    public void Exercicio3(){
        //criar vetor para receber a média
        double notas[]=new double[4];//vetor tamanho 4
        //preencher o vetor com as notas
        for (int i = 0; i < notas.length; i++) {
            //solicitar as notas para o usuário
            System.out.println("Informe a nota"+(i+1)+"do Aluno:");
            //ler a nota com o scanner
            notas[i]=sc.nextDouble();
        }
        //imprimir as notas e calcular a média
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota ["+(i+1)+"]="+notas[i]);
            //acumular o valor das notas na variavel
            media+=notas[i];
        }
        //dividir a media pelo numero de notas
        media /=notas.length;
        //imprimir a media
        System.out.println("A media é"+media);
    }
    public void Exercicio4(){
       // char letras [] = new char[]{'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j'};
        String letras2 [] = new String[]{"a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j"};
        //percorrer o vetor para procurar letras vogais ou consoantes
        //contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < letras2.length; i++) {
            if(letras2[i]!="a" && letras2[i]!="e" && letras2[i]!="i" && letras2[i]!="o" && letras2[i]!="u");
            System.out.println(letras2[i]+" é consoante");
            cont++;
        }
        //mostrar o contador de consoantes
        System.out.println("O nº de consoante é"+cont);
    }
    public void Exercicio4ex(){
        //digitar uma palavra
        System.out.println("Digite uma palavra");
        String palavra = sc.next();
        palavra = palavra.toLowerCase();
        //percorrer a Stringer para procurar letras vogais ou consoantes
        //contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u');
            System.out.println(c+ " é consoante");
            cont++;
        }
        //mostrar o contador de consoantes
        System.out.println("O nº de consoante é"+cont);
    }
    //ler 30 numeros e separar em pares e impares
    public void Exercicio5(){
        //criar um vetor para os nº
        int numeros[]=new int[20];
        int contPar=0; //contador numeros pares
        int contImpar=0; // contador numeros impares
        //preencher o vetor de numeros e deterniminar o nº de impares e pares
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("informe o nº["+i+"]=");
            numeros[i]=sc.nextInt();
            if(numeros[i]%2==0){
                contPar++;
            }else{
                contImpar++;
            }
        }
        //após a contagem dos pares e impares criar os respectivos vetores
        int nPar[]=new int [contPar];
        int nImpar[]=new int [contImpar];
        //distribuir os nº do vetor nº para os vetores par e impar
        contPar=0;
        contImpar=0;
        for (int i = 0; i < nImpar.length; i++) {
            if(numeros[i]%2==0){
                nPar[contPar]=numeros[i];
                contPar++;
            }
            else{
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
        }
    }

}
