import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        // Este programa calcula y muestra la suma de cada fila y cada columna del array.

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

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += array[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += array[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}
