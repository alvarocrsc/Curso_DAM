package Ejercicio_5;

public class HabitacionIndividual extends Habitacion {
    public HabitacionIndividual(int codigo, Tipo tipo, float precioBasePorNoche, Estado estado) {
        super(codigo, tipo, precioBasePorNoche, estado);
    }

    @Override
    public float calcularPrecioTotal(int noches) {
        return noches > 7 ? precioBasePorNoche * noches * 0.9f : precioBasePorNoche * noches;
    }
}
