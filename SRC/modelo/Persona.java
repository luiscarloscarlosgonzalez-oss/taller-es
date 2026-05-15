package SRC.modelo;

public abstract class Persona{
    
    protected String nombre;
    protected String id;
    protected String email;
     
  public Persona(String nombre,String id,String email){

    this.nombre = nombre;
    this.id =  id;
    this.email = email;
  }
    public void Mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}