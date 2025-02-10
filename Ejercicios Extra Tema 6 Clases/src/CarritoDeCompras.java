import java.util.Arrays;

public class CarritoDeCompras {
    private String cliente;
    private ItemCarrito[] listaProductos = new ItemCarrito[0];

    public CarritoDeCompras(String cliente) {
        this.cliente = cliente;
    }

    public boolean agregarProducto(Producto producto, int cantidad) {
        boolean producto_encontrado = false;
        for (ItemCarrito item : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(item.getProducto().getNombre())) {
                item.incrementarCantidad(cantidad);
                producto_encontrado = true;
                if (producto.getStock() < cantidad) {
                    System.out.println("\nStock insuficiente para " + producto.getNombre());
                    return false;
                }
            }
        }
        if(!producto_encontrado) {
            listaProductos = Arrays.copyOf(listaProductos, listaProductos.length + 1);
            listaProductos[listaProductos.length - 1] = producto;
        }
        System.out.println("\nEl producto ha sido agregado correctamente.");
        return true;
    }

    public boolean eliminarProducto(String nombreProducto) {
        ItemCarrito[] listaProductos2 = new ItemCarrito[listaProductos.length - 1];
        boolean producto_encontrado = false;
        for (int i = 0; i < listaProductos.length; i++) {
            if (!producto_encontrado) {
                listaProductos2[i] = listaProductos[i];
            }
            if (nombreProducto.equalsIgnoreCase(listaProductos[i].getProducto().getNombre())) {
                producto_encontrado = true;
                for (int j = i; j < listaProductos.length; j++)
                    listaProductos2[i] = listaProductos[i + 1];
            }
        }
        listaProductos = listaProductos2;
        if (!producto_encontrado) {
            System.out.println("\nEl producto introducido no existe.");
            return false;
        }
        System.out.println("\nEl producto se ha eliminado correctamente.");
        return true;
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de " + cliente + ":");
        if (listaProductos.length == 0) {
            System.out.println("El carrito está vacío.");
        } else {
            for (int i = 0; i < listaProductos.length; i++) {
                System.out.println("Producto: " + listaProductos[i].getProducto().getNombre() + " | Cantidad: " + listaProductos[i].getCantidad() +
                        " | Precio total: $" + (listaProductos[i].getProducto().getPrecio() * listaProductos[i].getCantidad()));
            }
        }
    }

}
