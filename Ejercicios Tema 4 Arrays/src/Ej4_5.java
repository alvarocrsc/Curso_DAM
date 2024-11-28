import com.sun.security.jgss.InquireType;

public class Ej4_5 {

    public static void main(String[] args) {

        int[] trimestre1 = new int[5];
        int[] trimestre2 = new int[5];
        int[] trimestre3 = new int[5];

        System.out.println("\nIntroduce las notas del grupo en el primer trimestre (0-10):");
        for (int i = 0; i < 5; i++) {
            int nota = Integer.parseInt(System.console().readLine());
            trimestre1[i] = nota;
        }

        System.out.println("\nIntroduce las notas del grupo en el segundo trimestre (0-10):");
        for (int i = 0; i < 5; i++) {
            int nota = Integer.parseInt(System.console().readLine());
            trimestre2[i] = nota;
        }

        System.out.println("\nIntroduce las notas del grupo en el tercer trimestre (0-10):");
        for (int i = 0; i < 5; i++) {
            int nota = Integer.parseInt(System.console().readLine());
            trimestre3[i] = nota;
        }

        float[] medias = new float[3];

        int suma1 = 0, suma2 = 0, suma3 = 0;
        for (int nota : trimestre1)
            suma1 += nota;
        for (int nota : trimestre2)
            suma2 += nota;
        for (int nota : trimestre3)
            suma3 += nota;

        float media1 = (float) suma1 / trimestre1.length;
        float media2 = (float) suma2 / trimestre2.length;
        float media3 = (float) suma3 / trimestre3.length;

        System.out.println("\nLas medias del grupo son:");
        System.out.println("Primer trimestre: " + media1);
        System.out.println("Segundo trimestre: " + media2);
        System.out.println("Tercer trimestre: " + media3);

        System.out.println("\nIntroduce el número de alumno del que se desee saber la media (1-5):");
        int alumno = Integer.parseInt(System.console().readLine());

        float mediaAlumno = (float) (trimestre1[alumno - 1] + trimestre2[alumno - 1] + trimestre3[alumno - 1]) / 3;

        System.out.println("\nLa nota media del alumno número " + alumno + " es " + mediaAlumno + ".");

    }
}
