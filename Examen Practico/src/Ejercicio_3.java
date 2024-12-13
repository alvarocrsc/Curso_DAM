import java.util.Arrays;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int tamano;

        do {
        System.out.println("Introduce un el tamaño del array:");
        tamano = Integer.parseInt(System.console().readLine());
        } while (tamano < 0);

        int[] array = new int[tamano];

        System.out.println("\nIntroduce números para llenar el array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = Integer.parseInt(System.console().readLine());

            if (array[i] < 0)
                break;
        }

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n" + Arrays.toString(array));

        boolean encontrado = false;
        System.out.println("\nIntroduce un número para buscar en el array:");
        int buscar = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < tamano - 1; i++) {
            if (buscar == array[i])
                encontrado = true;
        }

        System.out.println("\nEl número " + buscar + " ha sido encontrado: " + encontrado);
    }
}
