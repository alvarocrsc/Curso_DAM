package Ejercicio_4;

public class Gerente extends Empleado {
    private float bonoAnual;
    private String[] equipoACargo;

    public Gerente(int id, String nombre, float sueldoBase, int antiguedad, float bonoAnual, String[] equipoACargo) {
        super(id, nombre, sueldoBase, antiguedad);
        this.bonoAnual = bonoAnual;
        this.equipoACargo = equipoACargo;
    }

    @Override
    public float calcularSueldoFinal() {
        return (sueldoBase + bonoAnual) * (5 * antiguedad) / 100;
    }

    public String asignarProyecto(String proyecto) {
        String equipo = "";
        for(int i = 0; i < equipoACargo.length; i++) {
            equipo += equipoACargo[i] + ", ";
        }
        return "El proyecto asignado al equipo compuesto por " + equipo + " es " + proyecto;
    }
}
