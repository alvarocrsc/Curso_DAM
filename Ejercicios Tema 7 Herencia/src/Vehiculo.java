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

    public String mostrarInformacion() {
        return "Modelo: "
    }
}
