import java.util.Arrays;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();
        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nIntroduce los factores por los cuales escalar cada fila de la matriz:\n");
        int[] escalador = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            escalador[i] = scanner.nextInt();
        }
        System.out.println("\n" + Arrays.toString(escalador));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] *= escalador[i];
            }
        }

        System.out.println("\nMatriz escalada:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}
