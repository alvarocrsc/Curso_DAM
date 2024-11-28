import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("BIENVENIDO AL JUEGO DEL BARCO HUNDIDO!\n");
        System.out.println("================================================\n");
        System.out.println("A CONTINUACIÓN VAMOS A VER LAS REGLAS DEL JUEGO:");
        System.out.println("- INTRODUCIRÁS EL TAMAÑO DEL TABLERO EN FILAS Y COLUMNAS AL PRINCIPIO DEL JUEGO.");
        System.out.println("- AL PRINCIPIO TAMBIÉN INTRODUCIRÁS EL NÚMERO DE BARCOS A HUNDIR, CADA BARCO TIENE TAMAÑO '1'.");
        System.out.println("- EN EL TABLERO EXISTEN TRES CARACTERES DIFERENTES:");
        System.out.println("    -> '~' ESTE CARACTER REPRESENTA UNA CASILLA SIN COMPROBAR.");
        System.out.println("    -> 'O' ESTE CARACTER REPRESENTA UNA CASILLA DE AGUA.");
        System.out.println("    -> 'X' ESTE CARACTER REPRESENTA UNA CASILLA CON UN BARCO HUNDIDO.");
        System.out.println("- MIENTRAS NO HAYAS HUNDIDO TODOS LOS BARCOS, IRÁS INTRODUCIENDO COORDENADAS X,Y TRATANDO DE GOLPEAR A LOS BARCOS.");
        System.out.println("- UNA VEZ HAYAS HUNDIDO TODOS, HABRÁS ALCANZADO LA VICTORIA\n");
        System.out.println("================================================\n");

        System.out.println("AHORA, YA SABES JUGAR, MUCHO ÁNIMO, A POR TODAS!!!!!!!!!!\n");
        System.out.println("================================================\n");

        int filas, columnas, ataqueFila, ataqueColumna, nBarcos, hundidos = 0;

        do {
            System.out.println("DAME UN TAMAÑO DEL TABLERO, PRIMERO LAS FILAS Y LUEGO LAS COLUMNAS (COMO MÍNIMO : 5 Y COMO MÁXIMO: 20):");
            filas = Integer.parseInt(scanner.nextLine());
            columnas = Integer.parseInt(scanner.nextLine());
        } while ((filas < 5 || filas > 20) || (columnas < 5 || columnas > 20));

        System.out.println("\n================================================\n");

        int totalCasillas = filas * columnas;

        do {
            System.out.println("DAME UN NÚMERO DEL BARCOS, (COMO MÍNIMO : 1 Y COMO MÁXIMO: " + totalCasillas +"):");
            nBarcos = Integer.parseInt(scanner.nextLine());
        } while (nBarcos < 1 || nBarcos > totalCasillas);

        System.out.println("\n================================================\n");

        char[] tablero = inicializarTablero(totalCasillas, '~');
        boolean[] barcos = new boolean[totalCasillas];
        crearBarcos(barcos, nBarcos, random);

        while (hundidos < nBarcos) {

            mostrarTablero(tablero, filas,columnas);
            System.out.println("\n================================================\n");
            System.out.println("YA HAS HUNDIDO " + hundidos + " BARCOS, Y SOLO TE QUEDAN: " + (nBarcos - hundidos));

            do {
                System.out.println("ELIJA LA FILA Y COLUMNA QUE QUIERE ATACAR!!");
                ataqueFila = Integer.parseInt(scanner.nextLine());
                ataqueColumna = Integer.parseInt(scanner.nextLine());

                if (ataqueFila < 0 || ataqueFila >= filas || ataqueColumna < 0 || ataqueColumna >= columnas) {
                    System.out.println("COORDENADAS FUERA DEL TABLERO. INTÉNTALO DE NUEVO.");
                    continue;
                }

                int ataque = ataqueFila * columnas + ataqueColumna;

                if (tablero[ataque] == 'O' || tablero[ataque] == 'X') {
                    System.out.println("ESA CASILLA YA HA SIDO ATACADA. ELIGE OTRA.");
                } else
                    break;

            } while (true);

            int ataque = ataqueFila * columnas + ataqueColumna;

            if (barcos[ataque]) {
                tablero[ataque] = 'X';
                hundidos++;
                System.out.println("\nHAS ENCONTRADO... UN BARCO!!!!!!!!\n");
            }
            else {
                tablero[ataque] = 'O';
                System.out.println("\nHAS ENCONTRADO... AGUA. ¡LA PRÓXIMA SERÁ!\n");
            }
        }

        System.out.println("\nENHORABUENA, HAS CONSEGUIDO HUNDIR TODOS LOS BARCOS!");
    }

    public static char[] inicializarTablero(int tamaño, char caracter) {
        char[] tablero = new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            tablero[i] = caracter;
        }
        return tablero;
    }

    public static void mostrarTablero(char[] tablero, int filas, int columnas) {
        System.out.println("ESTE ES EL ESTADO ACTUAL DEL TABLERO:\n");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i] + " ");
            if ((i + 1) % columnas == 0) {
                System.out.println();
            }
        }

        System.out.println("\n================================================\n");
    }

    public static void crearBarcos(boolean[] barcos, int nBarcos, Random random) {
        int barcosColocados = 0;

        while (barcosColocados < nBarcos) {
            int posicion = random.nextInt(barcos.length);
            if (!barcos[posicion]) {
                barcos[posicion] = true;
                barcosColocados++;
            }
        }
    }
}