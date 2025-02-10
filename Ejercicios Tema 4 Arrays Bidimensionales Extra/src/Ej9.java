import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas y columnas n de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("\nIntroduce los valores de la matriz\n:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nIntroduce el número por el que se desee multiplicar:");
        int x = scanner.nextInt();

        System.out.println("\nMatriz modificada:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] *= x;
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
