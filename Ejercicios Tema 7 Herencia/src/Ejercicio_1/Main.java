package Ejercicio_1;

import Ejercicio_2.Empleado;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los vehículos
        Coche coche = new Coche("1234ABC", "Toyota", "Corolla", 50, Estado.DISPONIBLE, Combustible.ELECTRICO);
        Camioneta camioneta = new Camioneta("5678DEF", "Ford", "Ranger", 80, Estado.DISPONIBLE, 1000, Traccion.CUATROPORCUATRO);
        Motocicleta motocicleta = new Motocicleta("9101GHI", "Honda", "CBR600", 40, Estado.DISPONIBLE, 600);

        // Probar mostrarInformacion()
        System.out.println(coche.mostrarInformacion());
        System.out.println(camioneta.mostrarInformacion());
        System.out.println(motocicleta.mostrarInformacion());

        // Probar alquilar()
        System.out.println("Alquilando vehículos...");
        System.out.println("Coche alquilado: " + coche.alquilar());
        System.out.println("Camioneta alquilada: " + camioneta.alquilar());
        System.out.println("Motocicleta alquilada: " + motocicleta.alquilar());

        // Intentar alquilar nuevamente
        System.out.println("Intentando alquilar nuevamente...");
        System.out.println("Coche alquilado: " + coche.alquilar());

        // Probar calcularCosto(int dias)
        int dias = 5;
        System.out.println("Costo de alquiler por " + dias + " días:");
        System.out.println("Coche: " + coche.calcularCosto(dias));
        System.out.println("Camioneta: " + camioneta.calcularCosto(dias));
        System.out.println("Motocicleta: " + motocicleta.calcularCosto(dias));

        // Probar devolver()
        System.out.println("Devolviendo vehículos...");
        coche.devolver();
        camioneta.devolver();
        motocicleta.devolver();

        // Mostrar información actualizada
        System.out.println(coche.mostrarInformacion());
        System.out.println(camioneta.mostrarInformacion());
        System.out.println(motocicleta.mostrarInformacion());
    }
}
