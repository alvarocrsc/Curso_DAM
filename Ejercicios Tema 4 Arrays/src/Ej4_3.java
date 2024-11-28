import java.util.Arrays;
import java.util.Random;

public class Ej4_3 {

    public static void main(String[] args) {
        int[] t = {1, 2 ,3 ,4, 5, 6, 7};
        desordenar(t);
    }

    public static void desordenar(int[] t) {

        Random random = new Random();
        int[] y = t.clone();

        for (int i = 0; i < t.length; i++) {
            int j = random.nextInt(i + 1);

            int aux = y[i];
            y[i] = y[j];
            y[j] = aux;
        }

        System.out.println("Tabla original: \n" + Arrays.toString(t) + "\n");
        System.out.println("Tabla desordenada: \n" + Arrays.toString(y) + "\n");
    }
}
