package POOHeranca.Pessoas;

public class Professores extends Funcionarios  {
   private String materiaAula;
   
   private String sala;
public String getMateriaAula() {
    return materiaAula;
}
public void setMateriaAula(String materiaAula) {
    this.materiaAula = materiaAula;
}
public String getSala() {
    return sala;
}
public void setSala(String sala) {
    this.sala = sala;
}

    
}
