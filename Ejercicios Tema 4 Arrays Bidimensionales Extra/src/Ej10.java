import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();
        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();
        System.out.println("Introduce el número a buscar:");
        int x = scanner.nextInt();
        int apariciones = 0;

        int[][] matriz = new int[n][n];
        System.out.println("\nIntroduce los valores de la matriz\n:");
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
                if (matriz[i][j] == x) {
                    apariciones++;
                }
            }
            System.out.println();
        }

        System.out.println("\nEl número " + x + " se repite " + apariciones + " veces en la matriz.");
    }
}
