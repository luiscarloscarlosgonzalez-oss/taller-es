package Estudiante;

public class Ejecutarestudiante {
    public static void main(String[] args) {
        // Arreglo de objetos 
        Estudiante1 objE = new Estudiante1();
        Estudiante1[] est = new Estudiante1[4];

        est[0] = new Estudiante1("Ana", 2, "Ingeniería de sistemas ", 4.5, 20);
        est[1] = new Estudiante1("Carlos", 3, "Ingeniería de sistemas ", 4.2, 21);
        est[2] = new Estudiante1("Luisa", 1, "Ingeniería de sistemas ", 4.7, 19);
        est[3] = new Estudiante1("Miguel", 4, "Ingeniería de sistemas ", 4.0, 22);

       
     for (int i = 0; i < est.length; i++) {
            System.out.println(est[i].getNombre() + " --> " + est[i].getPrograma());        
        }
 
        //Promedio general de las notas de los estudiantes
        double sumaNota = 0.0;
        for (int i = 0; i < est.length; i++) {
            sumaNota += est[i].getNotapromedio();        
        }
        System.out.println(sumaNota / est.length);
 
        //Almacenar en el arreglo edades la edad de los estudiantes
        int[] edades = new int[est.length];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = est[i].getEdad();
        }
 
        //Uso del método calcularEdadPromedio
        
 
        
 
           //Promedio de estudiantes que estan en 3r semestre
        double sumaNotasSemestre = 0.0;
        int contadorSemestre = 0;
        for (int i = 0; i < est.length; i++) {
            if (est[i].getSemestre() == 3) {
                sumaNotasSemestre += est[i].getNotapromedio();
                contadorSemestre++;
            }
        }
        if (contadorSemestre > 0) {
            System.out.println("Promedio de notas para el semestre 3: " + (sumaNotasSemestre / contadorSemestre));
        } else {
            System.out.println("No hay estudiantes en el semestre 3");
        }
       

    }    
}