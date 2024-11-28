import java.util.Arrays;
import java.util.Scanner;

public class Ej4_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nSueldos = 0;
        int maxSueldos = 1000;
        int[] sueldos = new int[maxSueldos];

        while (true) {
            System.out.println("Introduce un sueldo (-1 para finalizar): ");
            int sueldo = scanner.nextInt();

            if (sueldo == -1)
                break;

            if (nSueldos < maxSueldos)
                sueldos[nSueldos++] = sueldo;
            else {
                System.out.println("Máximo de sueldos alcanzado.");
                break;
            }
        }

        sueldos = Arrays.copyOf(sueldos, nSueldos);

        Arrays.sort(sueldos);
        for (int i = 0; i < sueldos.length / 2; i++) {
            int aux = sueldos[i];
            sueldos[i] = sueldos[sueldos.length - i - 1];
            sueldos[sueldos.length - i - 1] = aux;
        }

        System.out.println("\nSueldos ordenados de mayor a menor:");
        for (int sueldo: sueldos) {
            System.out.println(sueldo + " ");
        }

        int max = sueldos[0];
        int min = sueldos[sueldos.length - 1];
        float suma = 0, media;

        for (int sueldo: sueldos)
            suma += sueldo;

        media = suma / sueldos.length;

        System.out.println("\n           DATOS           ");
        System.out.println("===========================\n");
        System.out.println("Sueldo máximo: " + max + "\n");
        System.out.println("Sueldo mínimo: " + min + "\n");
        System.out.println("Media: " + media);

    }
}
