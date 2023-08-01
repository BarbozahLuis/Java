package RevisaoPOO.Agenda;

import RevisaoPOO.Cadastro.Animal;

public class Agenda extends Animal{
    String data;
    String hora;
    String servico;
    String dataHora; 
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public String getDataHora() {
        dataHora = data + hora;
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
