import java.util.Arrays;
import java.util.Random;

public class Ej4_2 {

    public static void main(String[] args) {
        int[] t = {1, 2 ,3 ,4, 5, 6, 7};
        desordenar(t);
    }

    public static void desordenar (int t[]) {

        Random random = new Random();

        for (int i = 0; i < t.length; i++) {
            int j = random.nextInt(i + 1);

            int aux = t[i];
            t[i] = j;
            t[j] = aux;
        }

        System.out.println(Arrays.toString(t));
    }
}
