import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas n de la matriz:");
        int n = scanner.nextInt();

        System.out.println("Introduce las columnas m de la matriz:");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int pares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = pares;
                pares += 2;
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
