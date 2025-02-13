package Ejercicio_2;

public class EmpleadoPorContrato extends Empleado {
    private int horasTrabajadas;
    private float tasaPorHora;
    private Contrato contrato;

    public EmpleadoPorContrato(String nombre, String idEmpleado, Departamento departamento, float salarioBase, int horasTrabajadas, float tasaPorHora, Contrato contrato) {
        super(nombre, idEmpleado, departamento, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tasaPorHora = tasaPorHora;
        this.contrato = contrato;
    }

    public void asignarTarea(String tarea) {
        System.out.println("Tarea asignada a " + nombre + ": " + tarea);
    }

    @Override
    public float calcularSalarioFinal() {
        return contrato == Contrato.MEDIO_TIEMPO ? horasTrabajadas * tasaPorHora : horasTrabajadas * tasaPorHora * 0.9f;
    }
}
