import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String nombreFichero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        nombreFichero = scanner.nextLine();
        BufferedReader in = null;
        try {
            if(nombreFichero.isEmpty()) {
                nombreFichero = "prueba.txt";
            }
            in = new BufferedReader(new FileReader("/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/" + nombreFichero));
            String linea;
            linea = in.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = in.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.print("Archivo no encontrado");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } finally {
            scanner.close();
            if (in != null) {
                in.close();
            }
        }
    }
}