package Ejercicio_1;

public class Vehiculo {
    private String matricula, marca, modelo;
    private int precioBasePorDia;
    private Estado estado;

    public Vehiculo(String matricula, String marca, String modelo, int precioBasePorDia, Estado estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precioBasePorDia = precioBasePorDia;
        this.estado = estado;
    }

    public boolean alquilar() {
        if (this.estado == Estado.DISPONIBLE) {
            this.estado = Estado.ALQUILADO;
            return true;
        }
        else
            return false;
    }

    public void devolver() {
        if (this.estado == Estado.ALQUILADO)
            this.estado = Estado.DISPONIBLE;
    }

    public float calcularCosto(int dias) {
        return this.precioBasePorDia * dias;
    }

    public String mostrarInformacion() {
        return "Matrícula: " + this.matricula +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nPrecio Base por día: " + this.precioBasePorDia +
                "\nEstado: " + this.estado;
    }
}
