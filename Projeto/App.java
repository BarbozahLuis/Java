package Projeto;

import java.util.Scanner;

import Projeto.Pessoas.PessoaFisica;
import Projeto.Pessoas.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaFisica pFisica = new PessoaFisica();
        PessoaJuridica pJuridica = new PessoaJuridica();

        pFisica.setNomeConta(sc.next());
    }
}
