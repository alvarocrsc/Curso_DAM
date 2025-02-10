public class Producto {
    private String nombre;
    private int stock;
    private float precio;

    public Producto (String nombre, int stock, float precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getStock() {
        return this.stock;
    }

    public float getPrecio() {
        return this.precio;
    }

}
