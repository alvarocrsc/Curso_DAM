package Ejercicio_5;

public class Suite extends Habitacion {
    public Suite(int codigo, double precioBasePorNoche, Estado estado) {
        super(codigo, Tipo.SUITE, precioBasePorNoche, estado);
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        double total = super.calcularPrecioTotal(noches);
        return (noches > 5) ? total * 1.3 : total;
    }

    public boolean agregarServicioPremium(String servicio) {
        if (serviciosCount < serviciosAdicionales.length) {
            serviciosAdicionales[serviciosCount++] = servicio;
            return true;
        }
        return false;
    }
}
