package Estudiante;

public class Estudiante {
    private String nombre;
    private int semestre;
    private String programa;
    private double notapromedio;
    private int edad;

    //constructor
     public Estudiante(String nombre,int semestre,String progrma,double notapromedio,int edad){

        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = progrma;
        this.notapromedio = notapromedio;
        this.edad = edad;
    
    }
public Estudiante() {
    
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getSemestre() {
    return semestre;
}

public void setSemestre(int semestre) {
    this.semestre = semestre;
}

public String getPrograma() {
    return programa;
}

public void setPrograma(String programa) {
    this.programa = programa;
}

public double getNotapromedio() {
    return notapromedio;
}

public void setNotapromedio(double notapromedio) {
    this.notapromedio = notapromedio;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

 public double calcularPromedio(int[]e){
    int suma = 0;
    for (int i = 0; i < e.length; i++) {
        suma += e[i];
    }
    return suma / e.length;
}

    public double calcularEdadPromedio(double[]e){
        double suma = 0.0;
        for (int i = 0; i < e.length; i++) {
            suma += e[i];
        }
        return suma / e.length;
    }
 
    
    

  
 @Override
 public String toString() {
    return "Estudiante [nombre=" + nombre + ", semestre=" + semestre + ", programa=" + programa + ", notapromedio="
            + notapromedio + ", edad=" + edad + "]";
   } 

}


