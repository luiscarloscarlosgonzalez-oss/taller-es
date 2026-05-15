package SRC.modelo;

public class Estudiante1 extends Persona {
     
    private int semestre;

    public Estudiante1(String nombre, String id, String email, int semestre) {
        super(nombre, id, email);
        this.semestre = semestre;
    }
   @Override
    public void Mostrarinformacion() {
        super.Mostrarinformacion();
        System.out.println("Semestre: " + semestre);
    } 
}
