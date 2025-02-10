public class Hora {
    private int hora, minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        minuto++;
        if (minuto >= 60) {
            minuto = 0;
            hora++;
        }
        if (hora >= 24) {
            hora = 0;
        }
    }

    public boolean setMinutos(int valor) {
        boolean min = false;
        if (valor >= 0 && valor <= 60) {
            this.minuto = valor;
            min = true;
        }
        return min;
    }

    public boolean setHora(int valor) {
        boolean hora = false;
        if (valor >= 0 && valor <= 24) {
            this.hora = valor;
            hora = true;
        }
        return hora;
    }

    public String toString() {
        return this.hora + ":" + this.minuto;
    }

}
