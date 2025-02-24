package Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana López", "A12345");
        Libro libro1 = new LibroCiencia("123-456", "Física Cuántica", "Einstein", 50.0, true);
        Libro libro2 = new LibroLiteratura("789-101", "Cien Años de Soledad", "García Márquez", 40.0, true);

        estudiante1.realizarPrestamo(libro1);
        estudiante1.realizarPrestamo(libro2);

        System.out.println(estudiante1.mostrarPrestamos());

        libro1.devolverLibro();
        libro2.devolverLibro();

        estudiante1.devolverPrestamo(libro1);
        estudiante1.devolverPrestamo(libro2);

        System.out.println("Después de devolver los libros:");
        System.out.println(estudiante1.mostrarPrestamos());
    }
}
