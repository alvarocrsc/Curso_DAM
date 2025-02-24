public class Habitacion {
    protected int numero;
    protected Tipo tipo;
    protected Estado estado;
    protected double precio;
    protected Cliente cliente;

    public Habitacion(int numero, Tipo tipo, Estado estado, double precio, Cliente cliente) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        this.cliente = cliente;
    }

    public Habitacion(int numero, Tipo tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void reservar(Cliente cliente) {


    }

    public void liberar() {
        estado = Estado.DISPONIBLE;
    }
}
