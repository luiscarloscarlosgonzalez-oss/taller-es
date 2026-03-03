package Taller1;

public class Inventario {

    Producto[] productos;
    int contador;

    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
        contador = 0;
    }

    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
        }
    }

    public Producto buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }
        return null;
    }

    public void actualizarStock(int id, int nuevaCantidad) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
        }
    }

    public double generarInformeValorTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total = total + (productos[i].getPrecio() * productos[i].getCantidadStock());
        }
        return total;
    }

    public Producto[] obtenerProductosAgotados() {
        int cont = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                cont++;
            }
        }

        Producto[] agotados = new Producto[cont];
        int j = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                agotados[j] = productos[i];
                j++;
            }
        }

        return agotados;
    }

    public void ordenarPorPrecioDescendente() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {
                    Producto aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
            }
        }
    }

    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i].getNombre() + " - $" + productos[i].getPrecio());
        }
    }
}
    

