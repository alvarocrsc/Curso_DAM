package Ejercicio_6;

public class Libro {
    protected String codigoISBN;
    protected String titulo;
    protected String autor;
    protected Categoria categoria;
    protected double precioBase;
    protected boolean disponibilidad;
    protected String[] prestamosRealizados;
    protected int prestamosCount;

    public Libro(String codigoISBN, String titulo, String autor, Categoria categoria, double precioBase, boolean disponibilidad) {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precioBase = precioBase;
        this.disponibilidad = disponibilidad;
        this.prestamosRealizados = new String[50];
        this.prestamosCount = 0;
    }

    public boolean prestarLibro(String nombreEstudiante) {
        if (disponibilidad && prestamosCount < prestamosRealizados.length) {
            prestamosRealizados[prestamosCount++] = nombreEstudiante;
            disponibilidad = false;
            return true;
        }
        return false;
    }

    public void devolverLibro() {
        disponibilidad = true;
    }

    public String mostrarInformacion() {
        return "ISBN: " + codigoISBN + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nCategoría: " + categoria + "\nDisponible: " + disponibilidad;
    }

    public double calcularPrecioFinal(int dias) {
        return precioBase * dias;
    }
}
