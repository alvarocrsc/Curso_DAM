import java.util.Scanner;

public class Interfaz {
    Scanner scanner = new Scanner(System.in);
    private GestorHabitaciones gestorHabitaciones = new GestorHabitaciones();
    private GestorUsuarios gestorUsuarios = new GestorUsuarios();

    public void iniciar() {
        gestorHabitaciones.agregarHabitacionesPorDefecto();
        gestorUsuarios.registrarAdmin("Admin","1234");
        mostrarMenuInicio();
    }

    public void mostrarMenuInicio() {
        System.out.println("Bienvenido al sistema de gestión hotelera\n");
        System.out.println("=========================================\n");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registarse");
        System.out.println("3. Salir");
        System.out.print("\nSeleccione una opción: ");
        int opt = scanner.nextInt();
        System.out.println("\n=========================================\n");

        switch (opt) {
            case 1:
                iniciarSesion();
                break;
            case 2:
                registrarse();
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
        }
    }

    public void iniciarSesion() {
        System.out.println("Ingrese nombre de usuario: ");
        String user = scanner.next();
        System.out.println("Ingrese contraseña: ");
        String pass = scanner.next();
        Usuario u = gestorUsuarios.autenticar(user, pass);
        if (u instanceof Cliente) {
            menuCliente((Cliente) u);
        } else if (u instanceof Administrador) {
            menuAdministrador((Administrador) u);
        }
    }

    public void registrarse() {
        System.out.println("Ingrese nombre de usuario: ");
        String user = scanner.next();
        System.out.println("Ingrese contraseña: ");
        String pass = scanner.next();
        gestorUsuarios.registrarCliente(user, pass);
        mostrarMenuInicio();
    }

    public void menuAdministrador(Administrador admin) {
        System.out.println("Menú administrador");
        System.out.println("1. Ver habitaciones");
        System.out.println("2. Agregar habitación");
        System.out.println("3. Ver todas las reservas");
        System.out.println("4. Modificar habitación");
        System.out.println("5. Salir");
        System.out.println("\nSeleccione una opción");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1:
                gestorHabitaciones.mostrarHabitaciones();
                break;
            case 2:
                agregarHabitacion();
                break;
            case 3:
                gestorHabitaciones.mostrarReservas();
                break;
            case 4:

        }
    }

    private void agregarHabitacion() {
        int numero = scanner.nextInt();
        String tipo = scanner.next();
        double precio = scanner.nextDouble();
        gestorHabitaciones.agregarHabitacion(numero, Tipo.valueOf(tipo), precio);
    }

    public void menuCliente(Cliente cliente) {
        System.out.println("Menú cliente");
        System.out.println("1. Ver habitaciones disponibles");
        System.out.println("2. Reservar habitación");
        System.out.println("3. Ver mis reservas");
        System.out.println("4. Cancelar una reserva");
        System.out.println("5. Salir");
        System.out.println("\nSeleccione una opción");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1:
                gestorHabitaciones.mostrarDisponibles();
                break;
            case 2:
                System.out.println("Ingrese el número de la habitación que desea reservar:");
                int numero = scanner.nextInt();
                gestorHabitaciones.reservarHabitacion(numero, cliente);
                break;
            case 3:
                gestorHabitaciones.mostrarReservasCliente(cliente);
                break;
            case 4:
                System.out.println("Ingrese el número de la habitación que desea reservar:");
                int n = scanner.nextInt();
                gestorHabitaciones.cancelarReserva(n, cliente);
                break;
            case 5:
                break;
            default:
                System.out.println("La opción introducida no es válida.");
                break;
        }

        System.out.println("\n=========================================\n");
    }

    private void modificarHabitacionAdministrador() {

    }


}
