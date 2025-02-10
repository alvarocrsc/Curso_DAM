import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Este programa calcula la matriz transpuesta de una matriz nxm dada.

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

        int[][] transpuesta = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpuesta[j][i] = array[i][j];
            }
        }

        System.out.println("\nArray transpuesto:\n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
