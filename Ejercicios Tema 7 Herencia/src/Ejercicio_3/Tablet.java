package Ejercicio_3;

public class Tablet extends Producto {
    private int tamanoPantalla;
    private boolean esCompatibleConStylus;

    public Tablet(int codigo, String nombre, String marca, float precioBase, Categoria categoria, int stock, int tamanoPantalla, boolean esCompatibleConStylus) {
        super(codigo, nombre, marca, precioBase, categoria, stock);
        this.tamanoPantalla = tamanoPantalla;
        this.esCompatibleConStylus = esCompatibleConStylus;
    }

    @Override
    public float calcularPrecioFinal() {
        return (categoria == Categoria.ALTA_GAMA && esCompatibleConStylus) ? precioBase * 0.8f : precioBase;
    }

    public boolean verificarDisponibilidad() {
        return stock > 0 ? true : false;
    }
}
