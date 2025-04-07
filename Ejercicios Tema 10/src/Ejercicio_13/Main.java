package Ejercicio_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 10/src/Ejercicio_13/club.data";
        Map<String, Socio> club = new TreeMap<>();
        Socio socio = new Socio("asd","asd",new Date(3,421,32));
        showMenu();
        try {
            club = readData(file);
            System.out.println(club);
        } catch (IOException e) {
            System.out.println("El fichero no se ha encontrado.");
        }

        System.out.print("\nIntroduce una opción (1 - 7): ");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:

        }



    }

    public static void showMenu() {
        System.out.println("\nGestión del club");
        System.out.println("================\n");
        System.out.println("1. Alta socio.");
        System.out.println("2. Baja socio.");
        System.out.println("3. Modificación socio.");
        System.out.println("4. Listar socios por apodo.");
        System.out.println("5. Listar socios por antigüedad.");
        System.out.println("6. Listar los socios con alta anterior a un año determinado.");
        System.out.println("7. Salir.\n");
    }

    public static Map<String, Socio> readData(String fileName) throws IOException {
        Map<String, Socio> club = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line, apodo, nombre;
            int year, month, day;
            String[] socio;
            while((line = br.readLine()) != null) {
                socio = line.split(",");
                apodo = socio[0];
                nombre = socio[1];
                year = Integer.parseInt(socio[2]);
                month = Integer.parseInt(socio[3]);
                day = Integer.parseInt(socio[4]);
                Date date = new Date(year, month, day);

                Socio socioInstance = new Socio(apodo, nombre, date);
                club.put(apodo, socioInstance);
            }
        }
        return club;
    }
}
