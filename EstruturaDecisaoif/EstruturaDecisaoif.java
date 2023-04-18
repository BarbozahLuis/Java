package EstruturaDecisaoif;

import java.util.Scanner;

public class EstruturaDecisaoif {
    Scanner sc = new Scanner(System.in);

    public void desicaoIf() {
        System.out.println("Qual é o preço do produto?");
        double precoProduto = sc.nextDouble();
        //boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (precoProduto>=100 && precoProduto<200) { // Estrutura de decisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
        }
        if (precoProduto>=200) { // Estrutura de decisão if
            // Desconto para produtos de alto valor.
            percentualDesconto = 10.0;
        }
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto);
    }

    public void decisaoIfElse(){
        System.out.println("Digite o preço do produto");
        double precoProduto = sc.nextDouble();
        double percentualDesconto = 0.0;
        if(precoProduto<100){
            percentualDesconto = 0.0;
        } else if(precoProduto>=100 && precoProduto <200) {
            percentualDesconto = 5.0;
        } else if(precoProduto>=200 && precoProduto<300) {
            percentualDesconto = 10.0;
        } else {
            percentualDesconto = 15.0;
        }
        // Regra de três
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto);
    }
}
