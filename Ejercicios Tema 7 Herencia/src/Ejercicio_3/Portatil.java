package Ejercicio_3;

import Ejercicio_1.Combustible;

public class Portatil  extends Producto {
    private String procesador;
    private int ram;

    public Portatil(int codigo, String nombre, String marca, float precioBase, Categoria categoria, int stock, String procesador, int ram) {
        super(codigo, nombre, marca, precioBase, categoria, stock);
        this.procesador = procesador;
        this.ram = ram;
    }

    @Override
    public float calcularPrecioFinal() {
        return (categoria == Categoria.ALTA_GAMA) ? precioBase * 0.8f : precioBase;
    }

    public boolean verificarDisponibilidad() {
        return stock > 0 ? true : false;
    }
}
