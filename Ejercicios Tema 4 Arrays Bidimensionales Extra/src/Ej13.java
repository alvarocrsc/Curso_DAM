import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();
        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        System.out.println("\nIntroduce los valores de la matriz\n:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz inicial: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        int c1, c2;
        do {
            System.out.println("\nIntroduce una columna c1 (0-" + (m - 1) + ") de la matriz para intercambiarla con otra:");
            c1 = scanner.nextInt();
        } while (c1 < 0 || c1 >= m);
        do {
            System.out.println("\nIntroduce una columna c2 (0-" + (m - 1) + ") de la matriz para intercambiarla con la anterior:");
            c2 = scanner.nextInt();
        } while (c2 < 0 || c2 >= m);

        for (int i = 0; i < m; i++) {
            int temp = matriz[i][c1];
            matriz[i][c1] = matriz[i][c2];
            matriz[i][c2] = temp;
        }

        System.out.println("\nMatriz resultante: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
