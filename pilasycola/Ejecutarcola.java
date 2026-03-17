package pilasycola;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ejecutarcola {
    public static void main(String[] args) {
        Queue<Integer> cola = new ArrayDeque<>();

        // INSERTAR ELEMENTOS A LA COLA
        cola.add(10);
        cola.add(15);
        cola.add(8);
        cola.add(45);
        cola.add(69);
        cola.add(35);

        // MOSTRAR elementos de la cola
        System.out.println(cola); // [10, 15, 8, 45, 69, 35]

        // MOSTRAR ELEMENTO QUE ESTA ALA CABEZA DE LA COLA
        System.out.println(cola.element()); // 10

            //Agrear otro elemento con el método offer
        cola.offer(55);

                //Mostrar los elementos de la cola
        System.out.println(cola); //[10, 15, 8, 45, 69, 35,]

        // MOSTRAR elementos de la cola
        System.out.println(cola); // [10, 15, 8, 45, 69, 35]

        // MOSTRAR ELEMENTO QUE ESTA ALA CABEZA DE LA COLA
        System.out.println(cola.peek()); // 10


        // ELIMINAR PRIMER ELEMENTO DE LA COLA
          
          System.out.println("Elemento eliminado: " + cola.poll()); // 10

          // ELIMINAR PRIMER ELEMENTO DE LA COLA
          
          System.out.println("Elemento eliminado: " + cola.remove()); // 10

        // MOSTRAR elementos de la cola
        System.out.println(cola); // [ 8, 45, 69, 35]}

        // oBTENER EL TAMAÑO DE LA COLA
        System.out.println("Tamaño de la cola: " + cola.size()); // 5

        // COMPARAR LAS COLAS 
        System.out.println("Comparar colas: " + cola.equals(cola)); // true

        // eliminar todos los elementos de la cola
            cola.clear();
         System.out.println("Eliminar todos los elementos de la cola: " + cola.isEmpty()); // null

         // convertir la cola a un arreglo
         cola.toArray();

         // limpiar la cola
            cola.clear();
            System.out.println("Limpiar la cola: " + cola.isEmpty()); // true
    }
    
}
