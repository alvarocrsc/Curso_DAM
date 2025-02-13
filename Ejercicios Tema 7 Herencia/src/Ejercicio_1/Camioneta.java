package Ejercicio_1;

public class Camioneta extends Vehiculo {
    private float capacidadCarga;
    private Traccion traccion;


    public Camioneta(String matricula, String marca, String modelo, int precioBasePorDia, Estado estado, float capacidadCarga, Traccion traccion) {
        super(matricula, marca, modelo, precioBasePorDia, estado);
        this.capacidadCarga = capacidadCarga;
        this.traccion = traccion;
    }

    @Override
    public float calcularCosto(int dias) {
        return (this.traccion == Traccion.CUATROPORCUATRO)
                ? super.calcularCosto(dias) * 1.2f
                : super.calcularCosto(dias);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nCapacidad de carga: " + this.capacidadCarga +
                "\nTracción: " + this.traccion;
    }
}
