package Ejercicio_6;

public class Estudiante {
    private String nombre;
    private String idEstudiante;
    private Libro[] prestamos;
    private int numPrestamos;

    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.prestamos = new Libro[10];
        this.numPrestamos = 0;
    }

    public boolean realizarPrestamo(Libro libro) {
        if (libro.prestarLibro(nombre) && numPrestamos < prestamos.length) {
            prestamos[numPrestamos++] = libro;
            return true;
        }
        return false;
    }

    public void devolverPrestamo(Libro libro) {
        for (int i = 0; i < numPrestamos; i++) {
            if (prestamos[i] == libro) {
                libro.devolverLibro();
                prestamos[i] = prestamos[--numPrestamos];
                prestamos[numPrestamos] = null;
                return;
            }
        }
    }

    public String mostrarPrestamos() {
        StringBuilder sb = new StringBuilder("Préstamos de " + nombre + ":\n");
        for (int i = 0; i < numPrestamos; i++) {
            sb.append(prestamos[i].mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
}
