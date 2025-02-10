import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        // Dado un array bidimensional de enteros nxm, este programa encuentra el
        // número mayor y el número menor del array, indicando sus posiciones.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas n: ");
        int n = scanner.nextInt();

        System.out.println("Introduce el número de columnas m: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

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

        int max = 0, nmax = 0, mmax = 0, min = 100, nmin = 0, mmin = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    nmax = i;
                    mmax = j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    nmin = i;
                    mmin = j;
                }
            }
        }

        System.out.println("\nEl número mayor es: " + max + ". Se encuentra en la fila " + nmax  + " y la columna " + mmax + ".");
        System.out.println("El número menor es: " + min + ". Se encuentra en la fila " + nmin  + " y la columna " + mmin + ".");
    }
}
