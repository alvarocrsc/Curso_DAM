import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        // Este programa, dado un array bidimensional de enteros nxm y un número k,
        // busca dicho número en el array.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas n: ");
        int n = scanner.nextInt();

        System.out.println("Introduce el número de columnas m: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        boolean encontrado = false;

        System.out.println("\nArray generado:\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 100);
                if (array[i][j] < 10)
                    System.out.print(" " + array[i][j] + " ");
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nIntroduce el número a buscar en el array:");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == k) {
                    encontrado = true;
                    break;
                }
            }
        }

        System.out.println("\nEl número " + k + " ha sido encontrado: " + encontrado);
    }
}
