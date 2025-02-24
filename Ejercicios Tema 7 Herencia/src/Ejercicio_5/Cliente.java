package Ejercicio_5;

public class Cliente {
    private String nombre;
    private String documentoIdentidad;
    private int numeroReservas;
    private Habitacion[] habitacionesReservadas;
    private int reservasCount;

    public Cliente(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.numeroReservas = 0;
        this.habitacionesReservadas = new Habitacion[10];
        this.reservasCount = 0;
    }

    public boolean hacerReserva(Habitacion habitacion) {
        if (habitacion.reservar(nombre) && reservasCount < habitacionesReservadas.length) {
            habitacionesReservadas[reservasCount++] = habitacion;
            numeroReservas++;
            return true;
        }
        return false;
    }

    public void cancelarReserva(Habitacion habitacion) {
        for (int i = 0; i < reservasCount; i++) {
            if (habitacionesReservadas[i] == habitacion) {
                habitacion.liberar();
                habitacionesReservadas[i] = habitacionesReservadas[--reservasCount];
                habitacionesReservadas[reservasCount] = null;
                return;
            }
        }
    }

    public String mostrarReservas() {
        StringBuilder sb = new StringBuilder("Reservas de " + nombre + ":\n");
        for (int i = 0; i < reservasCount; i++) {
            sb.append(habitacionesReservadas[i].mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
}