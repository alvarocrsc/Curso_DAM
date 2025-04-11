package Ejercicio_13;

import java.util.Date;

public class Socio {
    private String apodo, nombre;
    private Date fecha;

    public Socio(String apodo, String nombre, Date fecha) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return apodo +
                "," + nombre +
                "," + fecha.getYear() +
                "," + fecha.getMonth() +
                "," + fecha.getDay();
    }
}
