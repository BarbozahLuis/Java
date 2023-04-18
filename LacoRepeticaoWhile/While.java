package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

public class While {
    Scanner sc = new Scanner(System.in);
    public void exmeplo1(){
        int iteracao = 0;
        while (iteracao<10){
            iteracao+=1;
            System.out.println("O nº da iteração é"+iteracao);
        }
    }
    public void Random(){
        Random rd = new Random();
        int nSorteado = rd.nextInt(10);
        boolean tenteNovamente=true;
        System.out.println("Aperte CTRL+C, a quaquer momento, para parar");
        while (tenteNovamente) {
            System.out.println("Digite um nº");
            int nDigitado = sc.nextInt();
            if(nDigitado==nSorteado){
                System.out.println("Acertou Miseravi");
                tenteNovamente=false;
            }
            else{
                System.out.println("Erroooou");
                tenteNovamente=true;
            }
        }
    }
    public void exmeplo3(){
        //ler 5 nº inteiros e printar na ordem
        //criar um vetor com while
        int vetor[]=new int[5];
        int i = 0;
        while (i<5){
            System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<5){
            System.out.println(vetor[i]);
            i++;
        }
    }
}
