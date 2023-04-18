

import java.util.Scanner;

public class NotaAluno {
    Scanner sc = new Scanner(System.in);
    public void notasFrequencia() {
        System.out.println("Informe a Nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1+nota2)/2;
        System.out.println("A média do Aluno é");
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno Esta Aprovado?"+ mediaAprovado);
        System.out.println("Informe a frequencia do aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno>= 75;
        System.out.println("Valor da media e maior");
        System.out.println("O Aluno Esta Aprovado?"+ frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println ("O Aluno esta Aprovado no curso?"+aprovacaoFinal);
        
    }
}
