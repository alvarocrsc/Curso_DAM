import java.util.Arrays;

public class GestorHabitaciones {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    public void agregarHabitacion(int numero, Tipo tipo, double precio) {
        Habitacion habitacion = new Habitacion(numero, tipo, precio);
        if (buscarHabitacion(numero) == null) {
            Arrays.copyOf(habitaciones, habitaciones.length + 1);
            habitaciones[habitaciones.length - 1] = habitacion;
            System.out.println("La habitación " + numero + " ha sido agregada con éxito.");
        } else {
            System.out.println("La habitación" + numero + " ya existe");
        }
    }
    
    public void agregarHabitacionesPorDefecto() {
        agregarHabitacion(123, Tipo.SUITE, 280);
        agregarHabitacion(222, Tipo.SIMPLE, 150);
        agregarHabitacion(321, Tipo.DOBLE, 190);
    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacionInstance : habitaciones) {
            if (habitacionInstance.numero == numero) {
                return habitacionInstance;
            }
        }
        return null;
    }

    public void mostrarHabitaciones() {
        if (habitaciones == null || habitaciones.length == 0) {
            System.out.println("No hay habitaciones registradas en el sistema.");
            return;
        }

        System.out.println("\n===== LISTADO DE HABITACIONES =====");
        System.out.println("Número   | Tipo      | Precio    | Estado");
        System.out.println("------------------------------------------");

        for (Habitacion habitacion : habitaciones) {
            String estado = habitacion.estaReservada() ? "Reservada" : "Disponible";
            System.out.println(habitacion.getNumero() + "       | "
                    + habitacion.getTipo() + "   | $"
                    + habitacion.getPrecio() + "    | "
                    + estado);
        }
    }

    public void mostrarReservas() {
        System.out.println("\nListado de habitaciones reservadas:\n");
        boolean hayReservas = false;

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaReservada()) {
                System.out.println("Habitación " + habitacion.getNumero() + " - " + habitacion.getTipo());
                System.out.println("Reservada por: " + habitacion.getCliente().getUsuario());
                System.out.println("--------------------------------------");
                hayReservas = true;
            }
        }
        if (!hayReservas) {
            System.out.println("No hay habitaciones reservadas en este momento.");
        }
    }

    public void mostrarReservasCliente(Cliente cliente) {
        System.out.println("\n===== RESERVAS DE " + cliente.getUsuario().toUpperCase() + " =====");
        boolean tieneReservas = false;

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaReservada() && habitacion.getCliente().equals(cliente)) {
                System.out.println("Número: " + habitacion.getNumero());
                System.out.println("Tipo: " + habitacion.getTipo());
                System.out.println("Precio: $" + habitacion.getPrecio());
                System.out.println("--------------------------------------");
                tieneReservas = true;
            }
        }

        if (!tieneReservas) {
            System.out.println(cliente.getUsuario() + " no tiene reservas activas.");
        }
    }

    public void mostrarDisponibles() {
        if (habitaciones == null || habitaciones.length == 0) {
            System.out.println("No hay habitaciones registradas en el sistema.");
            return;
        }

        System.out.println("\n===== HABITACIONES DISPONIBLES =====");
        boolean hayDisponibles = false;

        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.estaReservada()) {
                System.out.println("Número: " + habitacion.getNumero());
                System.out.println("Tipo: " + habitacion.getTipo());
                System.out.println("Precio: $" + habitacion.getPrecio());
                System.out.println("--------------------------------------");
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay habitaciones disponibles en este momento.");
        }
    }

    public void reservarHabitacion(int numero, Cliente cliente) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null) {
            if (!habitacion.estaReservada()) {
                habitacion.reservar(cliente);
                System.out.println("La habitación " + numero + " ha sido reservada con éxito.");
            } else {
                System.out.println("La habitación " + numero + " ya está reservada.");
            }
        } else {
            System.out.println("La habitación con número " + numero + " no existe.");
        }
    }

    public void cancelarReserva(int numero, Cliente cliente) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion.getCliente() == cliente) {
            habitacion.liberar();
        } else {
            System.out.println("Al cliente introducido no le corresponde la habitación " + numero);
        }
    }

    public void modificarHabitacion(int numero, Tipo nuevoTipo, double nuevoPrecio) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null) {
            habitacion.setTipo(nuevoTipo);
            habitacion.setPrecio(nuevoPrecio);
            System.out.println("La habitación " + numero + " ha sido modificada.");
        } else {
            System.out.println("La habitación con número " + numero + " no existe.");
        }
    }
}
