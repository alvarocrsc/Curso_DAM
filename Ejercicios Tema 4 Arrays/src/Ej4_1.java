import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ej4_1 {
    public static void main(String[] args) {
        int[] t = {8, 32 ,5 ,5, 5, 5, 32};
        int clave = 4;

        System.out.println(Arrays.toString(buscarTodos(t, clave)));
    }

    public static int[] buscarTodos(int t[], int clave) {
        int[] tabla = new int[0];

        boolean encontrado = false;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = i;
                encontrado = true;
            }
        }

        return tabla;
    }
}
