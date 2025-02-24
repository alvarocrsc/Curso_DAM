import java.util.Arrays;

public class GestorHabitaciones {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    public void agregarHabitacion(int numero, Tipo tipo, double precio) {

        Habitacion habitacion = new Habitacion(numero, tipo, precio);
        if (buscarHabitacion(numero) == null) {
            Arrays.copyOf(habitaciones, habitaciones.length + 1);
            habitaciones[habitaciones.length - 1] = habitacion;
        }
    }
    
    public void agregarHabitacionesPorDefecto() {

    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacionInstance : habitaciones) {
            if (habitacionInstance.numero == numero) {
                System.out.println("La habitación introducida ya existe");
                return habitacionInstance;
            }
        }
        return null;
    }

    public void mostrarHabitaciones() {

    }

    public void mostrarReservas() {

    }

    public void reservarHabitacion(int numero, Cliente cliente) {

    }

    public void cancelarReserva(int numero, Cliente cliente) {

    }

    public void modificarHabitacion(int numero, Tipo nuevoTipo, double nuevoPrecio) {

    }
}
