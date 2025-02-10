import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las filas y columnas n de la matriz:");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        int valor = 1;
        int inicioFila = 0, finFila = n - 1;
        int inicioColumna = 0, finColumna = n - 1;

        while (inicioFila <= finFila && inicioColumna <= finColumna) {
            for (int i = inicioColumna; i <= finColumna; i++) {
                matriz[inicioFila][i] = valor++;
            }
            inicioFila++;

            for (int i = inicioFila; i <= finFila; i++) {
                matriz[i][finColumna] = valor++;
            }
            finColumna--;

            if (inicioFila <= finFila) {
                for (int i = finColumna; i >= inicioColumna; i--) {
                    matriz[finFila][i] = valor++;
                }
                finFila--;
            }

            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    matriz[i][inicioColumna] = valor++;
                }
                inicioColumna++;
            }
        }

        System.out.println("Matriz en forma de espiral:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
