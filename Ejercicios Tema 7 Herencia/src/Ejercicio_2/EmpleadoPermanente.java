package Ejercicio_2;

public class EmpleadoPermanente extends Empleado {
    private int anyosAntiguedad;
    private float bonoAnual;

    public EmpleadoPermanente(String nombre, String idEmpleado, Departamento departamento, float salarioBase) {
        super(nombre, idEmpleado, departamento, salarioBase);
    }

    public void asignarTarea(String tarea) {
        System.out.println("Tarea asignada a " + nombre + ": " + tarea);
    }

    @Override
    public float calcularSalarioFinal() {
        return this.salarioBase + (this.anyosAntiguedad * 0.05f * this.salarioBase) + this.bonoAnual;
    }
}
