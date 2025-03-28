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
        String nombre = "";

        while (!tipoDato) {
            try {
                System.out.print("Introduce tu nombre: ");
                nombre = scanner.nextLine();
                tipoDato = true;
            } catch (InputMismatchException e) {
                System.out.print("Tipo de dato introducido no válido.");
                scanner.nextLine();
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/Ejercicio_2/datos.txt"));
            writer.write("Nombre: " + nombre);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
