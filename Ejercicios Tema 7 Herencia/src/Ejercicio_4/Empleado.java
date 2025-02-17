package Ejercicio_4;

public abstract class Empleado {
    protected int id, antiguedad;
    protected String nombre;
    protected float sueldoBase;

    public Empleado (int id, String nombre, float sueldoBase, int antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    public String mostrarInformacion() {
        return "\nID: " + id +
                "\nNombre: " + nombre +
                "\nSueldo Base: " + sueldoBase +
                "\nAntigüedad: " + antiguedad;
    }

    public abstract float calcularSueldoFinal();

    public static int calcularAnyosParaJubilacion(int edadActual) {
        return 65 - edadActual;
    }
}
