import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader( new FileReader("/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/prueba.txt"));
            String r = in.readLine();
            System.out.print(r);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}