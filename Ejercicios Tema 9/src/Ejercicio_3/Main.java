package Ejercicio_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file1 = "/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/Ejercicio_3/num1.txt";
        String file2 = "/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/Ejercicio_3/num2.txt";
        String result = "/home/alvaro/Documentos/GitHub/Curso_DAM/Ejercicios Tema 9/src/Ejercicio_3/num3.txt";

        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(readNumbers(file1));
            numbers.addAll(readNumbers(file2));

            Collections.sort(numbers);

            writeNumbers(numbers, result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Integer> readNumbers(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        }
        return numbers;
    }

    public static void writeNumbers(List<Integer> numbers, String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : numbers) {
                bw.write(num + "\n");
            }
        }
    }
}
