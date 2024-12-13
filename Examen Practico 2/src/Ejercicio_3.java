public class Ejercicio_3 {
    public static void main(String[] args) {

        int tamano;

        do {
            System.out.println("Introduce un el tamaño del array:");
            tamano = Integer.parseInt(System.console().readLine());
        } while (tamano < 8);

        int[] array = new int[tamano];

        System.out.println("\nIntroduce números para llenar el array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = Integer.parseInt(System.console().readLine());

            if (array[i] < 0)
                break;
        }

        int max, min;

        for (int i = 0; i < tamano; i++) {

        }

    }
}
