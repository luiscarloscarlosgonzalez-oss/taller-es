package SRC.servicios;

import SRC.estructuras.excepciones.EstudianteNoEncontradoException;
import SRC.modelos.Estudiante;
import java.util.HashMap;

public class EstudianteService {

    private HashMap<Integer, Estudiante> estudiantes;

    public EstudianteService() {
        estudiantes = new HashMap<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getId(), estudiante);
        System.out.println("ESTUDIANTE REGISTRADO CORRECTAMENTE");
    }

    public Estudiante buscarEstudiante(int id) throws EstudianteNoEncontradoException {
        Estudiante estudiante = estudiantes.get(id);
        if (estudiante == null) {
            throw new EstudianteNoEncontradoException("No se encontró un estudiante con ID: " + id);
        }

        return estudiante;
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        for (Estudiante estudiante : estudiantes.values()) {
            estudiante.mostrarInformacion();
            System.out.println("-------------------------");
        }
    }

}
    



    



