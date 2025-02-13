package Ejercicio_2;

public abstract class Empleado {
    protected String nombre, idEmpleado;
    protected Departamento departamento;
    protected float salarioBase;

    public Empleado(String nombre, String idEmpleado, Departamento departamento, float salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public String mostrarInformacion() {
        return "\nNombre: " + this.nombre +
                "\nID: " + this.idEmpleado +
                "\nDepartamento: " + this.departamento +
                "\nSalario base: " + this.salarioBase + "€";
    }

    public abstract float calcularSalarioFinal();

}
