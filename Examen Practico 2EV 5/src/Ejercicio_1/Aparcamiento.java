package Ejercicio_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aparcamiento {
    private char[][] aparcamiento = new char[8][12];

    public void inicializarAparcamiento() {
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[0].length; j++) {
                aparcamiento[i][j] = 'O';
            }
        }
    }

    public void visualizarAparcamiento() {
        System.out.println("    0 1 2 3 4 5 6 7 8 9 10 11");
        System.out.println("  _________________________");
        for (int i = 0; i < aparcamiento.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < aparcamiento[0].length; j++) {
                System.out.print(aparcamiento[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void alquilar(int fila, int columna) {
        if (aparcamiento[fila][columna] == 'O') {
            aparcamiento[fila][columna] = 'X';
            System.out.println("\nSe ha alquilado correctamente la plaza [" + fila + ", " + columna + "]\n");
        } else {
            System.out.println("\nLa plaza [" + fila + ", " + columna + "] ya está ocupada.\n");
        }
    }

    public void liberar(int fila, int columna) {
        if (aparcamiento[fila][columna] == 'X') {
            aparcamiento[fila][columna] = 'O';
            System.out.println("\nSe ha liberado correctamente la plaza [" + fila + ", " + columna + "]\n");
        }
    }

    public void consultarLibres() {
        int plazasLibres = 0;
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[0].length; j++) {
                if (aparcamiento[i][j] == 'O') {
                    plazasLibres++;
                }
            }
        }
        System.out.println("\nHay " + plazasLibres + " plazas libres en el aparcamiento.\n");
    }

    public void filasMasOcupadas() {
        int plazasOcupadas = 0, max = 0;
        int[] filasMaxOcupadas = new int[0];
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[0].length; j++) {
                if (aparcamiento[i][j] == 'X') {
                    plazasOcupadas++;
                }
            }
            if (plazasOcupadas > max) {
                max = plazasOcupadas;
                filasMaxOcupadas = new int[1];
                filasMaxOcupadas[filasMaxOcupadas.length - 1] = i;
            } else if (plazasOcupadas == max) {
                max = plazasOcupadas;
                filasMaxOcupadas = Arrays.copyOf(filasMaxOcupadas, filasMaxOcupadas.length + 1);
                filasMaxOcupadas[filasMaxOcupadas.length - 1] = i;
            }
            plazasOcupadas = 0;
        }
        if (filasMaxOcupadas.length > 1) {
            System.out.print("Las filas con el máximo número de plazas ocupadas son las ");
            for (int i = 0; i < filasMaxOcupadas.length; i++) {
                System.out.print(filasMaxOcupadas[i]);
                System.out.print(i == filasMaxOcupadas.length - 1 ? "." : ", ");

            }
        } else {
            System.out.print("La fila con el máximo número de plazas ocupadas es la " + filasMaxOcupadas[0]);
        }
    }

    public void buscarPlazasContiguas() {

    }
}
