package SRC.modelos;

import java.util.LinkedList;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private int CuposMaximos;


    private LinkedList<Materia> prerequisitos;

    private  Queue <Materia> colaEspera;

    private LinkedList<Estudiante> inscritos;

    public Materia(String codigo, String nombre,
                   int cuposMaximos, int creditos) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.CuposMaximos = cuposMaximos;
        this.creditos = creditos;

        prerequisitos = new LinkedList<>();

        colaEspera = new ArrayDeque<>();

        inscritos = new LinkedList<>();
    }

    
    public void agregarPrerequisito(Materia materia) {

        prerequisitos.add(materia);
    }

    public boolean hayCupos() {

        return inscritos.size() < CuposMaximos;
    }


    public void inscribirEstudiante(Estudiante estudiante) {

        if (hayCupos()) {

            inscritos.add(estudiante);

            System.out.println("Inscripcion exitosa.");

        } else {

            colaEspera.add(estudiante);

            System.out.println(
                    "Materia llena. Estudiante agregado a cola de espera."
            );
        }
    }

    // mostrar cola
    public void mostrarColaEspera() {

        if (colaEspera.isEmpty()) {

            System.out.println("No hay estudiantes en espera.");
            return;
        }

        int posicion = 1;

        for (Estudiante e : ColaEspera) {

            System.out.println(
                    "Posicion " + posicion + ": " + e.getNombre()
            );

            posicion++;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Materia> getPrerequisitos() {
        return prerequisitos;
    }
}



    

