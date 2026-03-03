package Taller1;

public class EjecutarProducto {
    public static void main(String[] args) {

        Inventario inv = new Inventario(5);

        inv.agregarProducto(new Producto(1, "Mouse", 50000, 10));
        inv.agregarProducto(new Producto(2, "Teclado", 80000, 3));
        inv.agregarProducto(new Producto(3, "Monitor", 600000, 2));
        inv.agregarProducto(new Producto(4, "USB", 30000, 15));
        inv.agregarProducto(new Producto(5, "Audifonos", 120000, 4));

        for (int i = 0; i < 5; i++) {
            System.out.println(inv.productos[i].getNombre() + " --> " + inv.productos[i].getCantidadStock());
        }

        System.out.println("Valor total: " + inv.generarInformeValorTotal());

        Producto[] agotados = inv.obtenerProductosAgotados();
        System.out.println("Productos con poco stock:");
        for (int i = 0; i < agotados.length; i++) {
            System.out.println(agotados[i].getNombre());
        }

        inv.ordenarPorPrecioDescendente();
        System.out.println("Ordenados por precio:");
        inv.mostrarProductos();

        Producto p = inv.buscarPorId(3);
        if (p != null) {
            System.out.println("Producto encontrado: " + p.getNombre());
        }

        inv.actualizarStock(2, 20);
        System.out.println("Stock actualizado:");
        inv.mostrarProductos();
    }
}