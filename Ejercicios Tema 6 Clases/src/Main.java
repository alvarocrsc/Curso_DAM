//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(22,23);
        System.out.println(hora.setHora(25));
        System.out.println(hora.setMinutos(25));
        hora.inc();
        System.out.println(hora.toString());

        CuentaCorriente cli1 = new CuentaCorriente("123456789M", "Álvaro");
        CuentaCorriente cli2 = new CuentaCorriente("98764321A", "Juan", 550);
        CuentaCorriente cli3 = new CuentaCorriente("546372819Z", 50);
        cli1.ingresarDinero(50300);
        System.out.println(cli1.sacarDinero(50400));
        System.out.println(cli1.mostrarInformacion());

        Texto texto = new Texto(10);
        System.out.println(texto.getDateOfCreation());
        texto.anadirCadena("abcd",'f');
        System.out.println(texto.toString());
        System.out.println(texto.getDateOfModification());
        texto.anadirCaracter('z', 'b');
        System.out.println(texto.toString());
        System.out.println(texto.getDateOfModification());
        texto.anadirCadena("kdjfasiddf", 'b');
        System.out.println(texto.toString());
        texto.anadirCadena("efghi", 'f');
        System.out.println(texto.toString());


    }
}