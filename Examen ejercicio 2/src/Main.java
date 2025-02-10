import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Escaner para pedir numeros por pantalla
        Scanner Scanner = new Scanner(System.in);
        // Pedimos los numeros al usuario
        System.out.print("Introduce el primero de dos numeros mayores de 10: ");
        int Numero = Scanner.nextInt();
        System.out.print("Introduce el segundo de los numeros mayores de 10: ");
        int Numero1 = Scanner.nextInt();
        // Aseguramos que sean mayores de 10
        while (Numero <= 10 || Numero1 <= 10) {
            System.out.print("Introduce el primero de los numeros mayores de 10 que sea correcto: ");
            Numero = Scanner.nextInt();
            System.out.print("Introduce el segundo de los numeros mayores de 10 que sea correcto: ");
            Numero1 = Scanner.nextInt();
        }
        // Creamos las variables para sacar el maximo comun divisor
        int Minimo = Math.min(Numero, Numero1);
        int Maximo = Math.max(Numero, Numero1);
        int MaximoComunDivisor = 0;
        // Bucle para sacar el mcd de los numeros
        for (int i = 1; i < Minimo || i < Maximo; i++) {
            if (Minimo % i == 0 && Maximo % i == 0) {
                MaximoComunDivisor = i;
            }
            if (Minimo % i == 0 && Maximo % i == 0 && Maximo % Minimo == 0) {
                MaximoComunDivisor = Minimo;
            }
        }
        // Imprimimos el resutado
        System.out.println(MaximoComunDivisor);
        // Llamamos a la funcion para el mcm
        MinimoComunMultiplo(Minimo, Maximo);
        // Llamamos a la funcion amigos
        Amigos(Minimo,Maximo);
    }
    // Funcion para el mcm
    public static void MinimoComunMultiplo(int Minimo, int Maximo) {
        // Variable para el mcm
        int MinimoComunMultiplo;
        // Condicionales para llegar al mcm
        if (Maximo % Minimo == 0) {
            MinimoComunMultiplo = Maximo;
        }
        else MinimoComunMultiplo = Minimo * Maximo;
        // Imprimimos el resultado
        System.out.println(MinimoComunMultiplo);
    }
    // Funcion para sacar si los numeros son amigos
    public static void Amigos(int Minimo, int Maximo) {
        // variables para las sumas de divisores
        int SumaMaximo = 0;
        int SumaMinimo = 0;
        // Bucles para comprobar si son amigos
        for (int i = 1; i < Maximo; i++){
            if (Maximo % i == 0){
                SumaMaximo +=i;
            }
        }
        for (int i = 1; i < Minimo; i++){
            if (Minimo % i == 0){
                SumaMinimo +=i;
            }
        }
        // Imprimimos los resultados
        if (SumaMinimo == Maximo && SumaMaximo == Minimo){
            System.out.println("Los numeros " + Maximo + " y " + Minimo + " son amigos.");

        }
        else System.out.println("Los numeros no son amigos.");
    }
}