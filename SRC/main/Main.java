package SRC.main;
 
import SRC.estructuras.excepciones.EstudianteNoEncontradoException;
import SRC.modelos.Estudiante;
import SRC.servicios.EstudianteService;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        EstudianteService estudianteService = new EstudianteService();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante por ID");
            System.out.println("3. Listar Estudiantes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("ID: ");
                    String idStr = scanner.nextLine();
                    int id = Integer.parseInt(idStr);

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Semestre: ");
                    int semestre = scanner.nextInt();
                    scanner.nextLine();

                    Estudiante estudiante = new Estudiante(nombre, id, email, semestre);
                            

                    estudianteService.registrarEstudiante(estudiante);

                    break;

                case 2:

                    System.out.print("Ingrese ID: ");
                    String buscarIdStr = scanner.nextLine();
                    try {
                        int buscarId = Integer.parseInt(buscarIdStr);
                        Estudiante encontrado = estudianteService.buscarEstudiante(buscarId);
                        encontrado.mostrarInformacion();
                    } catch (NumberFormatException nfe) {
                        System.out.println("ID inválido. Debe ser un número entero.");
                    } catch (EstudianteNoEncontradoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case 3:

                    estudianteService.listarEstudiantes();

                    break;

                case 4:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}