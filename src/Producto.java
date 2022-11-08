import java.util.Objects;

public class Producto {
    private final String identificador;
    private final String nombre;
    private int cantidad;

    public Producto(String identificador, String nombre, int cantidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return System.lineSeparator() +
                "-----PRODUCTO-----" + System.lineSeparator() +
                "Identificador: " + this.identificador + System.lineSeparator() +
                "Nombre: " + this.nombre + System.lineSeparator() +
                "Cantidad " + this.cantidad + System.lineSeparator() +
                System.lineSeparator();
    }

    public void incrementarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void vender() {
        if (this.cantidad != 0) this.cantidad -= 1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var producto = (Producto) o;
        return Objects.equals(identificador, producto.identificador);
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}
