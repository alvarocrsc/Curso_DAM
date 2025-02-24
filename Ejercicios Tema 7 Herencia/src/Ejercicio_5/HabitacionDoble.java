package Ejercicio_5;

public class HabitacionDoble extends Habitacion {
    private int personasExtra;

    public HabitacionDoble(int codigo, double precioBasePorNoche, Estado estado) {
        super(codigo, Tipo.DOBLE, precioBasePorNoche, estado);
        this.personasExtra = 0;
    }

    public boolean agregarPersonaExtra(int personasExtra) {
        this.personasExtra += personasExtra;
        return true;
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        double total = super.calcularPrecioTotal(noches);
        return (personasExtra > 2) ? total * 1.2 : total;
    }
}