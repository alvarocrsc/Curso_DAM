package Ejercicio_6;

public class LibroLiteratura extends Libro {
    private String[] resenas;
    private int resenaCount;

    public LibroLiteratura(String codigoISBN, String titulo, String autor, double precioBase, boolean disponibilidad) {
        super(codigoISBN, titulo, autor, Categoria.LITERATURA, precioBase, disponibilidad);
        this.resenas = new String[10];
        this.resenaCount = 0;
    }

    @Override
    public double calcularPrecioFinal(int dias) {
        double total = super.calcularPrecioFinal(dias);
        return (dias > 10) ? total * 1.05 : total;
    }

    public boolean agregarResena(String resena) {
        if (resenaCount < resenas.length) {
            resenas[resenaCount++] = resena;
            return true;
        }
        return false;
    }

    public void mostrarResenas() {
        System.out.println("Reseñas del libro:");
        for (int i = 0; i < resenaCount; i++) {
            System.out.println("- " + resenas[i]);
        }
    }
}