package Ejercicio_5;

import Ejercicio_4.Empleado;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Habitacion {
    protected int codigo;
    protected Tipo tipo;
    protected double precioBasePorNoche;
    protected Estado estado;
    protected String[] serviciosAdicionales;
    protected String[] historicoReservas;
    protected int serviciosCount;
    protected int reservasCount;

    public Habitacion(int codigo, Tipo tipo, double precioBasePorNoche, Estado estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.precioBasePorNoche = precioBasePorNoche;
        this.estado = estado;
        this.serviciosAdicionales = new String[10];
        this.historicoReservas = new String[50];
        this.serviciosCount = 0;
        this.reservasCount = 0;
    }

    public boolean reservar(String nombreCliente) {
        if (estado == Estado.DISPONIBLE && reservasCount < historicoReservas.length) {
            historicoReservas[reservasCount++] = nombreCliente;
            estado = Estado.RESERVADA;
            return true;
        }
        return false;
    }

    public void ocupar() {
        if (estado == Estado.RESERVADA) {
            estado = Estado.OCUPADA;
        }
    }

    public void liberar() {
        estado = Estado.DISPONIBLE;
    }

    public String mostrarInformacion() {
        return "Código: " + codigo + "\nTipo: " + tipo + "\nPrecio Base: " + precioBasePorNoche + "\nEstado: " + estado;
    }

    public double calcularPrecioTotal(int noches) {
        return precioBasePorNoche * noches;
    }
}