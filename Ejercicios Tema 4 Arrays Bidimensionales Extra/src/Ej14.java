import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();
        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("\nMatriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 1000);
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
