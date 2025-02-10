//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1200.0, 5);
        Producto p2 = new Producto("Mouse", 25.0, 10);
        Producto p3 = new Producto("Teclado", 45.0, 8);

        CarritoDeCompras carrito = new CarritoDeCompras("Juan Pérez");

        // Agregar productos
        carrito.agregarProducto(p1, 2);
        carrito.agregarProducto(p2, 3);
        carrito.agregarProducto(p3, 1);

        // Mostrar carrito
        carrito.mostrarCarrito();

        // Intentar agregar más de lo disponible
        carrito.agregarProducto(p1, 10); // No debería permitir

        // Eliminar un producto
        carrito.eliminarProducto("Mouse");
        carrito.mostrarCarrito();
    }
}