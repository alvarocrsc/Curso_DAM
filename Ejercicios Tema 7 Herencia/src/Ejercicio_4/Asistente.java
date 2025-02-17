package Ejercicio_4;

public class Asistente extends Empleado {
    private Turno turno;
    private String[] habilidades;

    public Asistente(int id, String nombre, float sueldoBase, int antiguedad, Turno turno, String[] habilidades) {
        super(id, nombre, sueldoBase, antiguedad);
        this.turno = turno;
        this.habilidades = habilidades;
    }

    @Override
    public float calcularSueldoFinal() {
        return (turno == Turno.NOCHE) ? sueldoBase * 1.1f : sueldoBase;
    }

    public boolean verificarHabilidad(String habilidad) {
        boolean encontrado = false;
        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i].equalsIgnoreCase(habilidad))
                encontrado = true;
        }
        return encontrado;
    }
}
