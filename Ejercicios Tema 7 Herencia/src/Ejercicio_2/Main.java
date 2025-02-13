package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de empleados
        EmpleadoPermanente empleado1 = new EmpleadoPermanente("Juan Perez", "101", Departamento.IT, 3000);
        EmpleadoPorContrato empleado2 = new EmpleadoPorContrato("Maria Gomez", "102", Departamento.FINANZAS, 0, 160, 20, Contrato.TIEMPO_COMPLETO);
        EmpleadoPorContrato empleado3 = new EmpleadoPorContrato("Carlos Ruiz", "103", Departamento.RECURSOSHUMANOS, 0, 80, 25, Contrato.MEDIO_TIEMPO);

        // Probar mostrarInformacion()
        System.out.println(empleado1.mostrarInformacion());
        System.out.println(empleado2.mostrarInformacion());
        System.out.println(empleado3.mostrarInformacion());

        // Probar calcularSalarioFinal()
        System.out.println("Salario final:");
        System.out.println("Empleado Permanente: " + empleado1.calcularSalarioFinal());
        System.out.println("Empleado Contrato Tiempo Completo: " + empleado2.calcularSalarioFinal());
        System.out.println("Empleado Contrato Medio Tiempo: " + empleado3.calcularSalarioFinal());

        // Probar asignarTarea()
        empleado1.asignarTarea("Desarrollar nuevo sistema");
        empleado2.asignarTarea("Preparar informe financiero");
        empleado3.asignarTarea("Capacitar nuevos empleados");
    }
}
