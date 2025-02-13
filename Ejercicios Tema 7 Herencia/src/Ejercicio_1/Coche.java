package Ejercicio_1;

public class Coche extends Vehiculo {
    private Combustible tipoCombustible;
    public Coche(String matricula, String marca, String modelo, int precioBasePorDia, Estado estado, Combustible tipoCombustible) {
        super(matricula, marca, modelo, precioBasePorDia, estado);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public float calcularCosto(int dias) {
        return (this.tipoCombustible == Combustible.ELECTRICO)
                ? super.calcularCosto(dias) * 0.9f
                : super.calcularCosto(dias);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo de Combustible: " + this.tipoCombustible;
    }
}
