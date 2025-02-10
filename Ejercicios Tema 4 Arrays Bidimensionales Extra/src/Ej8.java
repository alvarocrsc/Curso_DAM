import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas y columnas n de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
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

        boolean esTriangularSuperior = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    esTriangularSuperior = false;
                    break;
                }
            }
            if (!esTriangularSuperior) {
                break;
            }
        }

        if (esTriangularSuperior) {
            System.out.println("La matriz es triangular superior.");
        } else {
            System.out.println("La matriz no es triangular superior.");
        }

        scanner.close();
    }
}
