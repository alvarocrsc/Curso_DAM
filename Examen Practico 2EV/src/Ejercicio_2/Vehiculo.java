package Ejercicio_2;

public class Vehiculo {
    private String marca, modelo;
    private double precio;
    private TipoVehiculo tipo;

    public Vehiculo(String marca, String modelo, double precio, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Tipo: " + tipo);
    }
}
