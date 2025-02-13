package Ejercicio_3;

public abstract class Producto {
    protected int codigo;
    protected String nombre, marca;
    protected Categoria categoria;
    protected float precioBase;

    public Producto (int codigo, String nombre, String marca, float precioBase, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.categoria = categoria;
    }

    public String mostrarInformacion() {
        return "\nCódigo: " + codigo +
                "\nNombre: " + nombre +
                "\nMarca: " + marca +
                "\nPrecio Base: " + precioBase +
                "\nCategoría: " + categoria;
    }

    public abstract float calcularPrecioFinal();
}
