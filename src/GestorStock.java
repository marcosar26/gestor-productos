import java.util.HashSet;
import java.util.Set;

public class GestorStock {
    private final Set<Producto> productos = new HashSet<>();

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public String escribirDetallesProductos() {
        StringBuilder sb = new StringBuilder();

        this.productos.forEach(sb::append);

        return sb.toString();
    }

    public Producto localizarProducto(String identificador) {
        Producto producto = null;

        for (Producto p : this.productos) {
            if (identificador.equals(p.getIdentificador())) {
                producto = p;
                break;
            }
        }

        return producto;
    }

    public int cantidadEnStock(String identificador) {
        int cantidad = -1;

        Producto producto = localizarProducto(identificador);
        if (producto != null) {
            cantidad = producto.getCantidad();
        }

        return cantidad;
    }

    public Producto localizarProductoPorNombre(String nombre) {
        Producto producto = null;

        for (Producto p : this.productos) {
            if (nombre.equals(p.getNombre())) {
                producto = p;
                break;
            }
        }

        return producto;
    }

    public void recibirProducto(String identificador, int cantidad) {
        Producto producto = this.localizarProducto(identificador);

        if (producto != null) {
            producto.incrementarCantidad(cantidad);
        }
    }

    public String escribirMenorQue(int stock) {
        StringBuilder sb = new StringBuilder();

        this.productos.forEach(producto -> {
            if (producto.getCantidad() < stock) {
                sb.append(producto);
            }
        });

        return sb.toString();
    }
}
