package EstudoArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList<String> pessoas = new LinkedList<>(null);

    public void teste(){
        pessoas.add("Maria");
        pessoas.add("Joana");
        pessoas.add("Pedro");
        //adicionando na primiera posição
        pessoas.addFirst("Ana");
        //Buscando a primiera posição
        System.out.println(pessoas.getFirst());
    }
}
