import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {
        inicializarMatriz(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);
        contarParesImpares(matriz);
        buscarValor(matriz, 69);
        ordenarColumnas(matriz);
    }

    private static int[][] matriz = new int[7][7];

    public static void inicializarMatriz(int[][] matriz) {
        System.out.println("\nMATRIZ GENERADA:\n");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * (150 - 50 + 1) + 50);
                if(matriz[i][j] >= 100)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumarFilas(int[][] matriz) {
        int sumaFilas = 0;
        System.out.println("\nSUMA DE LAS FILAS DE LA MATRIZ:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] >= 100)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.print(" " + matriz[i][j] + " ");
                sumaFilas += matriz[i][j];
            }
            System.out.print("= " + sumaFilas);
            System.out.println();
            sumaFilas = 0;
        }
    }

    public static void sumarColumnas(int[][] matriz) {
        int sumaColumnas;
        System.out.println(" ||  ||  ||  ||  ||  ||  || ");
        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas += matriz[i][j];
            }
            System.out.print(sumaColumnas + " ");
        }
        System.out.println();
    }

    public static void contarParesImpares(int[][] matriz) {
        int impares = 0, pares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("\nHay " + pares + " números pares y " + impares + " números impares en la matriz.\n");
    }

    public static void buscarValor(int[][] matriz, int valor) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("Posición [" + i + ", " + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("\nEl número " + valor + " no se encuentra en la matriz.\n");
        }
    }

    public static void ordenarColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int k = 0; k < matriz.length - i - 1; k++) {
                    if (matriz[k][j] > matriz[k + 1][j]) {
                        int temp = matriz[k][j];
                        matriz[k][j] = matriz[k + 1][j];
                        matriz[k + 1][j] = temp;
                    }
                }
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int[] columna = new int[matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                columna[i] = matriz[i][j];
            }
            Arrays.sort(columna);

            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] = columna[i];
            }
        }

        System.out.println("\nMATRIZ CON COLUMNAS ORDENADAS:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= 100)
                    System.out.print(matriz[i][j] + " ");
                else
                    System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
