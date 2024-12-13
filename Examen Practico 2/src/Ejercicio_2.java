public class Ejercicio_2 {
    public static void main(String[] args) {

        System.out.println("Introduce un número entero positivo:");
        int n = Integer.parseInt(System.console().readLine());

        int suma = 0;

        for (int i = 1 ; i <= (n / 2); i++) {
            if (n % i == 0) {
                suma += i;
                System.out.print(i + " + ");
            }
        }
        System.out.print(" = " + suma + "\n");

        if (suma > n)
            System.out.println(n + " es un número abundante.");
        else
            System.out.println(n + " no es un número abundante.");
    }
}
