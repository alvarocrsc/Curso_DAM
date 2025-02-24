package Ejercicio_5;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez", "12345678");
        Habitacion hab1 = new HabitacionIndividual(101, 50.0, Estado.DISPONIBLE);
        Habitacion hab2 = new HabitacionDoble(102, 80.0, Estado.DISPONIBLE);
        Habitacion hab3 = new Suite(103, 150.0, Estado.DISPONIBLE);

        cliente1.hacerReserva(hab1);
        cliente1.hacerReserva(hab2);
        cliente1.hacerReserva(hab3);

        hab1.ocupar();
        hab2.ocupar();
        hab3.ocupar();

        System.out.println(cliente1.mostrarReservas());

        hab1.liberar();
        hab2.liberar();
        hab3.liberar();

        cliente1.cancelarReserva(hab2);

        System.out.println("Después de cancelar una reserva:");
        System.out.println(cliente1.mostrarReservas());
    }
}
