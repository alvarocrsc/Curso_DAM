package Ejercicio_13;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file = "/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 10/src/Ejercicio_13/club.data";
        Map<String, Socio> club = new TreeMap<>();

        try {
            club = readData(file);
            System.out.println(club);
        } catch (IOException e) {
            System.out.println("El fichero no se ha encontrado.");
        }

        showMenu();

        System.out.print("Introduce una opción (1 - 7): ");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
                System.out.print("\nIntroduce el apodo del socio: ");
                String apodo = scanner.next();
                System.out.print("\nIntroduce el nombre del socio: ");
                String nombre = scanner.next();
                System.out.print("\nIntroduce el año de ingreso: ");
                int year = scanner.nextInt();
                System.out.print("\nIntroduce el mes de ingreso: ");
                int month = scanner.nextInt();
                System.out.print("\nIntroduce el día de ingreso: ");
                int day = scanner.nextInt();
                Socio socio = new Socio(apodo, nombre, new Date(year, month, day));
                alta(socio, club);
                break;
            case 2:
                System.out.print("\nIntroduce el apodo del socio: ");
                String apodo2 = scanner.next();
                baja(apodo2, club);
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
                System.exit(1);
                break;
            default:

        }

        saveData(file, club);
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

    public static void saveData(String fileName, Map<String, Socio> club) throws IOException {
        Set<Map.Entry<String, Socio>> socios = club.entrySet();

        /*
        ArrayList<Map.Entry<String,Socio>> array = new ArrayList<>();
        array.addAll(socios);
        for(int i = 0;i< array.size();i++){
            System.out.println(array.get(i).getKey());
        }
        */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            Iterator<Map.Entry<String, Socio>> it;
            for (it = socios.iterator(); it.hasNext();) {
                Map.Entry<String, Socio> e = it.next();
                bw.write(e.getValue().toString() + "\n");
            }
        }
    }

    public static void alta(Socio socio, Map<String, Socio> club) {
        club.put(socio.getApodo(), socio);
        System.out.println("\nEl socio con apodo " + socio.getApodo() + " ha sido insertado correctamente.");
    }

    public static void baja(String apodo, Map<String, Socio> club) {
        if (club.containsKey(apodo)) {
            club.remove(apodo);
            System.out.println("\nEl socio con apodo " + apodo + " ha sido borrado correctamente.");
        } else {
            System.out.println("\nNo existe un socio con apodo " + apodo + ".");
        }
    }
}
