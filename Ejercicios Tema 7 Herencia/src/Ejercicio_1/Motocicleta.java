package Ejercicio_1;

public class Motocicleta extends Vehiculo {
    private int cilindrada;


    public Motocicleta(String matricula, String marca, String modelo, int precioBasePorDia, Estado estado, int cilindrada) {
        super(matricula, marca, modelo, precioBasePorDia, estado);
        this.cilindrada = cilindrada;
    }

    @Override
    public float calcularCosto(int dias) {
        return this.cilindrada > 500 ? super.calcularCosto(dias) * 1.05f : super.calcularCosto(dias);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nCilindrada: " + this.cilindrada;
    }
}
