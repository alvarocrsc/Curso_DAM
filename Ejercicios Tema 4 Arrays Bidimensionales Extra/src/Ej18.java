import Humanos.Persona;

import java.util.Arrays;
import java.util.Scanner;

public class Ej18 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona p = new Persona("Rodrigo");


        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("\nIntroduce los valores de la matriz\n:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        int[][] matrizRotada = Arrays.copyOf(matriz, matriz.length);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[n - 1 - i][n - 1 - j] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz rotada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrizRotada[i][j]);
            }
            System.out.println();
        }
    }
}
