import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();
        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz inicial: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz con solo impares: \n");
        int[][] matriz2 = Arrays.copyOf(matriz,matriz.length);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz2[i][j] % 2 == 0) {
                    matriz2[i][j] = 0;
                }
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
