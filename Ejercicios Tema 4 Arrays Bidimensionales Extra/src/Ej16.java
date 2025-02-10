import java.util.Scanner;
import Humanos.Persona;

public class Ej16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de filas para el triángulo de Pascal: ");
        int n = scanner.nextInt();

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        System.out.println("\nTriángulo de Pascal:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
