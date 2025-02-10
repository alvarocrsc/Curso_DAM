import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Escaner para leer al usuario por pantalla
        Scanner Scanner = new Scanner(System.in);
        // Pedimos el tamaño al usuario
        System.out.println("Ingrese el tamaño: ");
        int Size = Scanner.nextInt();
        // Aseguramos que sea mayor de 8
        while (Size <= 8){
            System.out.println("Ingrese un tamaño correcto: ");
            Size = Scanner.nextInt();
        }

        // Creamos la tabla numerica
        int[] Numeros = new int[Size];
        // Bucle para recorrer toda la tabla
        for (int i = 0; i < Size; i++){
            // Pedimos al usuario que nos de los numeros de la tabla
            System.out.println("Ingrese los numeros en el array: ");
            Numeros[i] = Scanner.nextInt();
            // Aseguramos que sean valores mayores de 0
            while (Numeros[i] <= 0){
                System.out.println("Ingrese un numeros en el array que sea correcto: ");
                Numeros[i] = Scanner.nextInt();
            }
        }
        // Pedimos el tamaño de la tabla char
        System.out.println("Ingrese el tamaño de la tabla: ");
        int Size1 = Scanner.nextInt();
        // Aseguramos que este entre 6 y 19
        while (Size1 <= 5 && Size1 > 20){
            System.out.println("Ingrese un tamaño correcto: ");
            Size1 = Scanner.nextInt();
        }
        // Creamos la tabla char
        char[] Numeros1 = new char[Size1];
        char c;
        for (int i = 0; i < Size; i++){
            System.out.println("Ingrese los numeros en el array: ");
            c = Scanner.next().charAt(0);
            while (Character.isLetter(c) == false ) {
                System.out.println("Ingrese un numeros en el array que sea correcto: ");
                c = Scanner.next().charAt(0);
            }
        }
    }
}