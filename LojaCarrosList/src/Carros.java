public class Carros {
    //atributos
    String marcas;
    String modelo;
    String ano;
    String cor;
    //métodos
    //contrutor(2 cheio, vazio)
    public Carros(String marcas, String modelo, String ano, String cor) {
        this.marcas = marcas;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    public Carros() {
    }
    public String getMarcas() {
        return marcas;
    }
    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    //método própro
    public String imprimirLN(){
        String imprimir = marcas+ " "+modelo+"\n";
        return imprimir;
    }
}
