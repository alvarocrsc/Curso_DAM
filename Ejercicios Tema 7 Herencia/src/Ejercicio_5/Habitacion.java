package Ejercicio_5;

import Ejercicio_4.Empleado;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Habitacion {
    protected int codigo;
    protected Tipo tipo;
    protected float precioBasePorNoche;
    protected Estado estado;
    protected String[] serviciosAdicionales, historicoReservas;

    public Habitacion(int codigo, Tipo tipo, float precioBasePorNoche, Estado estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.precioBasePorNoche = precioBasePorNoche;
        this.estado = estado;
    }

    public boolean reservar(String nombreCliente) {
        if (estado == Estado.DISPOBIBLE) {
            historicoReservas = Arrays.copyOf(historicoReservas, historicoReservas.length + 1);
            historicoReservas[historicoReservas.length - 1] = nombreCliente;
            estado = Estado.RESERVADA;
            return true;
        } else
            return false;
    }

    public void ocupar() {
        estado = Estado.OCUPADA;
    }

    public void liberar() {
        estado = Estado.DISPOBIBLE;
    }

    public String mostrarInformacion() {
        return "\nCódigo: " + codigo +
                "\nTipo: " + tipo +
                "\nPrecio Base: " + precioBasePorNoche +
                "\nEstado: " + estado;
    }

    public float calcularPrecioTotal(int noches) {
        return precioBasePorNoche * noches;
    }
}
