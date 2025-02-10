public class FechaHora {
    private int dia, mes, ano, hora, min, seg;

    public FechaHora(int dia, int mes, int ano, int hora, int min, int seg) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public void incrementarHora() {
        seg++;
        if (seg >= 60) {
            seg = 0;
            min++;
            if (min >= 60) {
                min = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                    dia++;
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        if (dia > 31) {
                            dia = 1;
                            mes++;
                            if (mes > 12) {
                                mes = 1;
                                ano++;
                            }
                        }
                    }
                    else if (mes == 2) {
                        if (dia > 28) {
                            dia = 1;
                            mes++;
                            if (mes > 12) {
                                mes = 1;
                                ano++;
                            }
                        }
                    }
                    else {
                        if (dia > 30) {
                            dia = 1;
                            mes++;
                            if (mes > 12) {
                                mes = 1;
                                ano++;
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean setFecha(int dia, int mes, int ano) {
        if((dia >=1 && dia <=31) && (mes>=1 && mes <=12) && ano > 0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

            System.out.println("Fecha actualizada con exito");
            return true;
        }
        System.out.println("Valores introducidos no válidos");
        return false;
    }



}
