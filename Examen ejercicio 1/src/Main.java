import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Elemento escaner para solicitar cosas al usuario por pantalla
        Scanner Scanner = new Scanner(System.in);
        // Pedimos un numero al usuario
        System.out.print("Introduce un numero entre 1 y 99: ");
        int Numero = Scanner.nextInt();
        // Bucle para asegurar el numero entero positivo entre 1 y 99
        while (Numero <= 0 || Numero >= 100){
            System.out.println("Ingrese un número entre 1 y 99 correcto: ");
            Numero = Scanner.nextInt();
        }
        // Condicional para los numeros menores de 50
        if (Numero < 50) {
            for (int i = 50; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        // Condicional para los numeros mayores de 50
        if (Numero > 50){
            for (int i = 0; i <= 50; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
  }