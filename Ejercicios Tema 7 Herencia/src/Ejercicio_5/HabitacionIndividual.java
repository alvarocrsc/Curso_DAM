package Ejercicio_5;

public class HabitacionIndividual extends Habitacion {
    public HabitacionIndividual(int codigo, double precioBasePorNoche, Estado estado) {
        super(codigo, Tipo.INDIVIDUAL, precioBasePorNoche, estado);
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        double total = super.calcularPrecioTotal(noches);
        return (noches > 7) ? total * 0.9 : total;
    }

    public boolean agregarServicioAdicional(String servicio) {
        if (serviciosCount < serviciosAdicionales.length) {
            serviciosAdicionales[serviciosCount++] = servicio;
            return true;
        }
        return false;
    }
}