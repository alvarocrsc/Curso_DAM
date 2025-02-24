package Ejercicio_6;

public class LibroCiencia extends Libro {
    private String[] experimentos;
    private int expCount;

    public LibroCiencia(String codigoISBN, String titulo, String autor, double precioBase, boolean disponibilidad) {
        super(codigoISBN, titulo, autor, Categoria.CIENCIA, precioBase, disponibilidad);
        this.experimentos = new String[10];
        this.expCount = 0;
    }

    @Override
    public double calcularPrecioFinal(int dias) {
        double total = super.calcularPrecioFinal(dias);
        return (dias > 7) ? total * 0.85 : total;
    }

    public boolean agregarExperimento(String experimento) {
        if (expCount < experimentos.length) {
            experimentos[expCount++] = experimento;
            return true;
        }
        return false;
    }

    public void mostrarExperimentos() {
        System.out.println("Experimentos disponibles:");
        for (int i = 0; i < expCount; i++) {
            System.out.println("- " + experimentos[i]);
        }
    }
}
