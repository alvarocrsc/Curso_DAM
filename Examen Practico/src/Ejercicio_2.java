public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Introduce un número positivo:");
        int n = Integer.parseInt(System.console().readLine());
        int suma = 0;

        for (int i = 1; i <= n; i++) {
                suma += i;
                System.out.println(suma);
        }
    }
}
