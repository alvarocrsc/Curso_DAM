public class Ej4_1 {

    public static void main(String[] args) {
        int[] a
    }

    public static int mediana(int[] array) {
        if (array.length % 2 == 1)
            return array[array.length / 2];
        else
            return array[array.length / 2] + array[(array.length - 1) / 2] / 2;
    }
}
