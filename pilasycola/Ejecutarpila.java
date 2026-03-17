package pilasycola;

import java.util.Stack;

public class Ejecutarpila {
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();

        System.out.println(pila.empty()); // true

        // insertar elementos ala pila
        pila.push("luis");
        pila.push("maria");
        pila.push("samuel");
        pila.push("yolian");

       // mostrar pila 
        System.out.println(pila); // false

      // mostrar el ultimo elemento de la pila sin eliminar el elemento
        System.out.println(pila.peek()); // yolian

         // eliminar el ultimo elemento de la pila
         System.out.println("Elemento eliminaddo: " + pila.pop()); // yolian

         // mostrar pila 
        System.out.println(pila); // false

        System.out.println("Buscar:"+ pila.search("luis"));//3
        System.out.println("Buscar:"+ pila.search("maria"));//2
        System.out.println("Buscar:"+ pila.search("samuel"));//1
        System.out.println("Buscar:"+ pila.search("yolian"));//0

        // obtener el ultimo elemento de la pila 

        System.out.println("ultimo elemento: " + pila.lastElement()); 

        // obtener el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size()); // 3

        // clonar la pila
         System.out.println("Clonar la pila: " + pila.clone()); // [luis, maria, samuel]

        // limpiar la pila
        pila.clear();
        System.out.println("Limpiar la pila: " + pila.empty()); // true

    }
    
}
