package ExercícioIfElse;



import java.util.Scanner;   

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1(){
        System.out.println("Digite o Valor um");
        int valor1 = sc.nextInt();
        System.out.println("Digite o Valor dois");
        int valor2 = sc.nextInt();
        if (valor1>valor2){
            System.out.println("Maior Valor é"+valor1);
        }
        else {
            System.out.println("O Maior Valor é"+valor2);
        }
    }
    public void exercicio2(){
        System.out.println("Digite o ano de nascimento");
        int nascimento = sc.nextInt();
        if (nascimento<=2007){
            System.out.println("Você poderá votar este ano");
        }
        else{
            System.out.println("Você não poderá votar este ano");
        }

    }

    public void exercicio3(){
        System.out.println("Digite a senha");
        int senha = sc.nextInt();
        if (senha==1234){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4(){
        System.out.println("Quantidade de maças");
        int quantidade = sc.nextInt();
        double valorDesconto = 0.0;
        if (quantidade==0){
            valorDesconto = 0.0;
        }
        else if(quantidade>=12){
            valorDesconto = 0.25;
        }
        else{
            valorDesconto = 0.30;
        }
        double valorTotalDesconto = (quantidade*valorDesconto);
        System.out.println("Valor da sua compra é"+valorTotalDesconto);
    }

    public void exercicio5(){
        System.out.println("Primeiro valor");
        int n1 = sc.nextInt();
        System.out.println("Segundo valor");
        int n2 = sc.nextInt();
        System.out.println("Terceiro valor");
        int n3 = sc.nextInt();
        //n1<n2<n3
        if (n1<n2 && n2<n3){
            System.out.println("A ordem crescente é");
        } else if(n1<n3 && n3<n2){
            System.out.println("A ordem crescente é");
        }

    }

    public void exercicio6(){

    }
}
