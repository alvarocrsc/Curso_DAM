public class CuentaCorriente {
    private String DNI, nombre;
    private int saldo;

    public CuentaCorriente(String DNI, String nombre, int saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public CuentaCorriente(String DNI, int saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public boolean sacarDinero(int cantidad) {
        boolean haySaldo = false;
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            haySaldo = true;
        }
        return haySaldo;
    }

    public void ingresarDinero(int cantidad) {
        this.saldo += cantidad;
    }

    public String mostrarInformacion() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.DNI + "\nSaldo: " + this.saldo;
    }
}
