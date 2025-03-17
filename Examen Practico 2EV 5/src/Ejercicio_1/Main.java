package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aparcamiento aparcamiento = new Aparcamiento();
        aparcamiento.inicializarAparcamiento();
        aparcamiento.visualizarAparcamiento();
        System.out.print("\nIntroduce el número de plazas a reservar: ");
        int plazas = scanner.nextInt();

        for (int i = 0; i < plazas; i++) {
            System.out.println("\nPLAZA " + (i + 1) + ":");
            System.out.print("\nIntroduce la fila donde se desea aparcar: ");
            int fila = scanner.nextInt();
            System.out.print("Introduce la columna donde se desea aparcar: ");
            int columna = scanner.nextInt();
            aparcamiento.alquilar(fila, columna);
        }
        aparcamiento.visualizarAparcamiento();
        aparcamiento.consultarLibres();
        aparcamiento.filasMasOcupadas();
    }
}
