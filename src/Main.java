import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorStock gestor = new GestorStock();

        Producto p1 = new Producto("ref41", "Patatas", 154);
        Producto p2 = new Producto("erfg3", "Melones", 25);
        Producto p3 = new Producto("fvbd4", "Sandias", 453);
        Producto p4 = new Producto("xfgds", "Piñas", 252);
        Producto p5 = new Producto("aerfv", "Chocolates", 453);

        Producto p6 = new Producto("ref41", "Chinaco", 5);

        // Añadir producto
        System.out.println("Añadir producto");
        gestor.addProducto(p1);
        gestor.addProducto(p2);
        gestor.addProducto(p3);
        gestor.addProducto(p4);
        gestor.addProducto(p5);

        gestor.addProducto(p6); // Mismo identificador que p1

        // Escribir detalles
        System.out.println("Escribir detalles");
        System.out.println(gestor.escribirDetallesProductos());

        // Localizar producto
        System.out.println("Localizar producto");
        System.out.println(gestor.localizarProducto("erfg3"));

        // Cantidad en stock
        System.out.println("Cantidad en stock");
        System.out.println(gestor.cantidadEnStock("fvbd4"));
        System.out.println(gestor.cantidadEnStock("asd")); // No existe

        // Localizar producto (por nombre)
        System.out.println("Localizar producto (por nombre)");
        System.out.println(gestor.localizarProductoPorNombre("Patatas"));

        // Recibir producto
        System.out.println("Recibir producto");
        System.out.println(gestor.localizarProducto("aerfv")); // Antes
        gestor.recibirProducto("aerfv", 10);
        System.out.println(gestor.localizarProducto("aerfv")); // Despues

        // Detalles de producto cuyo stock esté por debajo de una variable
        System.out.println("Detalles de producto cuyo stock esté por debajo de una variable");
        System.out.println(gestor.escribirMenorQue(200));
    }
}
