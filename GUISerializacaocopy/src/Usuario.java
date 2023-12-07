

import java.io.Serializable;

public class Usuario implements Serializable{
    //atributos
        String nome;
        int idade;
    public Usuario(String nome, int idade) {
        
            this.nome = nome;
            this.idade = idade;
            }
            public String getNome() {
            return nome;
            }
            public int getIdade() {
            return idade;
    }
    
}
