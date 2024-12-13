public class Ejercicio_1 {
    public static void main(String[] args) {

        System.out.println("Introduce un número positivo:");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("\n");

        int a = 1, b = 1;

        if (n >= 1)
            System.out.print(a);

        while (b <= n) {
            System.out.print(", " + b);
            int aux = b;
            b = a + b;
            a = aux;
        }
    }
}
