package Interfaz;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Mouse", "Teclado");

        Producto prod2 = new Producto();
        prod2.setNombre("Monitor");
        prod2.setTipo("Router");

        System.out.println("Producto 1: " + prod1.getNombre() + " - Tipo: " + prod1.getTipo());
        System.out.println("Producto 2: " + prod2.getNombre() + " - Tipo: " + prod2.getTipo());

        System.out.println("Total de productos creados: " + Producto.getTotalCreados());
    }
}
