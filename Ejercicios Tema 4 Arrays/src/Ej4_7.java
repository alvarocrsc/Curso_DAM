import java.util.Arrays;

public class Ej4_7 {
    public static void main(String[] args) {
        int[] t = {10, 1, 5, 8, 9, 2};
        System.out.println(Arrays.toString(suma(t, 3)));
    }

    public static int[] suma(int[] t, int numElementos) {

        int suma = 0;
        int[] resultados = new int[0];

        for (int i = 0; i < t.length; i++) {
            if ((i + numElementos) <= t.length) {
                for (int j = i; j < (i + numElementos); j++) {
                    suma += t[j];
                }
                resultados = Arrays.copyOf(resultados,i + 1);
                resultados[resultados.length - 1] = suma;
                suma = 0;
            }
        }
        return resultados;
    }
}
