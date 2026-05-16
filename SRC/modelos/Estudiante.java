package SRC.modelos;

import java.util.LinkedList;


public class Estudiante extends Persona {
    private int semestre;
    private double[][] notas;

    public Estudiante(String nombre, int id, String email, int semestre) {
        super(nombre, id, email);
        this.semestre = semestre;
        notas = new double[20][10];

    }
       

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ESTUDIANTE ===");
        System.out.println("ID:       " + getId());
        System.out.println("Nombre:   " + getNombre());
        System.out.println("Email:    " + getEmail());
        System.out.println("Semestre: " + semestre);
    }

    public int getSemestre() {
        return semestre;
    }

  

}