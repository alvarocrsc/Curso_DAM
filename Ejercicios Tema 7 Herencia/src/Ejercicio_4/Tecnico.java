package Ejercicio_4;

public class Tecnico extends Empleado {
    private String especialidad;
    private int horasExtra;

    public Tecnico(int id, String nombre, float sueldoBase, int antiguedad, String especialidad, int horasExtra) {
        super(id, nombre, sueldoBase, antiguedad);
        this.especialidad = especialidad;
        this.horasExtra = horasExtra;
    }

    @Override
    public float calcularSueldoFinal() {
        return sueldoBase + horasExtra * 50;
    }

    public void registrarHorasExtra(int horas) {
        this.horasExtra += horas;
    }
}
