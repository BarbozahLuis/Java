

import java.io.Serializable;

public class Agenda implements Serializable {
    //atributos
    String data;
    String hora;
    String usuario;
    String descricao;
    //metodos
    public Agenda(String data, String horas, String usuario, String descricao) {
        this.data = data;
        this.hora = hora;
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
        return hora;
    }
    public void setHoras(String horas) {
        this.hora = hora;
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
