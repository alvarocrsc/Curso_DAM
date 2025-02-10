import java.util.Scanner;

public class Ej3 {
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

        int f1, f2;
        do {
            System.out.println("\nIntroduce una fila f1 (0-" + (n - 1) + ") de la matriz para intercambiarla con otra:");
            f1 = scanner.nextInt();
        } while (f1 < 0 || f1 >= n);
        do {
            System.out.println("\nIntroduce una fila f2 (0-" + (n - 1) + ") de la matriz para intercambiarla con la anterior:");
            f2 = scanner.nextInt();
        } while (f2 < 0 || f2 >= n);

        for (int j = 0; j < m; j++) {
            int temp = matriz[f1][j];
            matriz[f1][j] = matriz[f2][j];
            matriz[f2][j] = temp;
        }

        System.out.println("\nMatriz resultante: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
