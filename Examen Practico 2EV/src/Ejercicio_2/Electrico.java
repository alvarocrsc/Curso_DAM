package Ejercicio_2;

public class Electrico extends Vehiculo {
    private int autonomia;

    public Electrico(String marca, String modelo, double precio, TipoVehiculo tipo, int autonomia) {
        super(marca, modelo, precio, tipo);
        this.autonomia = autonomia;
    }
}
