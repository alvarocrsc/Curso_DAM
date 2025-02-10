public class Ej3 {
    public static void main(String[] args) {

        // Este programa determina si un array bidimensional cuadrado es una matriz
        // identidad.

        int[][] array = new int[][]{{1, 0, 0, 0, 0},
                                    {0, 1, 0, 0, 0},
                                    {0, 0, 1, 0, 0},
                                    {0, 0, 0, 1, 0},
                                    {0, 0, 0, 0, 1}
        };

        boolean identidad = true;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    if (array[i][j] != 1) {
                        identidad = false;
                        break;
                    }
                }
                else {
                    if (array[i][j] != 0) {
                        identidad = false;
                        break;
                    }
                }
            }
        }

        System.out.println("El array introducido es matriz identidad: " + identidad + ".");
    }
}
