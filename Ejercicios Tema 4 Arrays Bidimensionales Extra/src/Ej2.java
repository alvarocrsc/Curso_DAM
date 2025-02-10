import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas y columnas n de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz resultante: \n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nLa suma de la diagonal principal es: " + suma);
    }
}
