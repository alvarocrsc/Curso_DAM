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
        this.estado = Estado.OCUPADA;
        this.cliente = cliente;
    }

    public boolean estaReservada() {
        return this.estado == Estado.DISPONIBLE;
    }

    public void liberar() {
        estado = Estado.DISPONIBLE;
        this.cliente = null;
        System.out.println("La habitación ha sido liberada");
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public double getPrecio() {
        return this.precio;
    }
}
