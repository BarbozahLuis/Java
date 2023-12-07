package GUISerializacao.src;

import java.io.Serializable;

public class Agenda implements Serializable {
    //atributos
    String data;
    String horas;
    String usuario;
    String descricao;
    public Agenda(String data, String horas, String usuario, String descricao) {
        this.data = data;
        this.horas = horas;
        this.usuario = usuario;
        this.descricao = descricao;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHoras() {
        return horas;
    }
    public void setHoras(String horas) {
        this.horas = horas;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
