package Exercicio;

import java.util.Scanner;

public class Exercicio {
    Scanner sc= new Scanner(System.in);
    /**
     * 
     */
    public void exercicio1 (){
        //lendo um vetor de string com laço while
        String letras[] = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        //char letras2[] = new char []{'a','b'...}
        int i=0; //iterador ou repetidor - elemento que servirá de contagem
        int cont=0; //contador para as consoantes
        while(i<letras.length){ //length tamanho do vetor
            if(letras[i]=="a"||letras[i]=="e"||letras[i]=="i"||letras[i]=="o"||letras[i]=="u"){//||=ou que pode ser qualquer das opções &=e que teria de ser igual a todas as condições

            }else{
                cont++;
                System.out.println(letras[i]+"é consoante");
            }
            i++;
        }
        System.out.println("o numero de consoantes é"+cont);
    }
    public void exercicio2(){
        int vetorN[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int i=0;
        int contPar=0;
        int contImpar=0;
        while(i<vetorN.length){
            if(vetorN[i]%2==0){
                contPar++;
            }else{
                contImpar++;
            }
            i++;
        }
        int vetorPar[]=new int[contPar];
        int vetorImpar[]=new int[contImpar];
        i=0;
        contPar=0;
        contImpar=0;
        while(i<vetorN.length){
            if(vetorN[i]%2==0){
               vetorPar[contPar]=vetorN[i];
                contPar++;
            }else{
                vetorImpar[contImpar]=vetorN[i];
                contImpar++;
            }
            i++;
        }
        i=0;
        while(i<vetorN.length){
            System.out.println("vetor["+i+"]="+vetorN[i]);
            i++;
        }
        i=0;
        while(i<vetorPar.length){
            System.out.println("vetor["+i+"]="+vetorPar[i]);
            i++;
    }
    i=0;
    while(i<vetorImpar.length){
        System.out.println("vetor["+i+"]="+vetorImpar[i]);
        i++;
}
}
}
