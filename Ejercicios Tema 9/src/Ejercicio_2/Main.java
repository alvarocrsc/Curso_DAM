package Ejercicio_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tipoDato = false;
        int edad = 0;

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        while (!tipoDato) {
            try {
                System.out.print("Introduce tu edad: ");
                edad = scanner.nextInt();
                tipoDato = true;
            } catch (InputMismatchException e) {
                System.out.print("Tipo de dato introducido no válido.\n");
            }
        }

        guardarDatos(nombre, edad);
        scanner.close();
    }

    public static void guardarDatos(String nombre, int edad) {
        try (FileWriter writer = new FileWriter("/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/Ejercicio_2/datos.txt", true)) {
            writer.write(nombre + ", " + edad + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}
