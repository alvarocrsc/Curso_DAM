import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    private String cadena = "";
    private final int longitud;
    private final String dateOfCreation;
    private String dateOfModification;


    public Texto(int longitud) {
        this.longitud = longitud;
        this.dateOfCreation = String.valueOf(LocalDate.now());
    }

    public void anadirCaracter(char letra, char bOrF) {
        if (this.cadena.length() + 1 <= this.longitud) {
            if (bOrF == 'b') {
                this.cadena = letra + this.cadena;
            } else if (bOrF == 'f')
                this.cadena += letra;
        }
        this.dateOfModification = String.valueOf(LocalDateTime.now());
    }

    public void anadirCadena(String cadena, char bOrF) {
        if (this.cadena.length() + cadena.length() <= this.longitud) {
            if (bOrF == 'b') {
                this.cadena = cadena + this.cadena;
            } else if (bOrF == 'f')
                this.cadena += cadena;
        }
        this.dateOfModification = String.valueOf(LocalDateTime.now());
    }

    public int nVocales() {
        int vocales = 0;
        String cadena = this.cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contains("a") || cadena.contains("e") || cadena.contains("i") || cadena.contains("o") || cadena.contains("u")) {
                vocales++;
            }
        }
        return vocales;
    }

    public String getDateOfCreation() {
        return this.dateOfCreation;
    }
    public String getDateOfModification() {
        return this.dateOfModification;
    }

    public String toString() {
        return this.cadena;
    }


}
