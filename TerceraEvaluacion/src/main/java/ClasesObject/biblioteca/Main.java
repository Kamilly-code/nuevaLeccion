package ClasesObject.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Cabeleb","Calvo", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio("Blas","Blez",LocalDate.of(2010,12,1));
        Socio socio3 = new Socio("Fermín","Fez",LocalDate.of(1999,1,1));
        Socio socio4 = new Socio("Alba","Álvarez",LocalDate.of(2005,10,10));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

       /* Collections.sort(socios);
        for (Socio socio: socios) {
            System.out.println(socio);
        }*/

        System.out.println("Orden natural:");
        for (Socio socio: socios) {
            System.out.println(socio);
        }

        CompararFechasNacimiento comparador = new CompararFechasNacimiento();
        socios.sort(comparador);

        System.out.println("\nOrdenados por la clase comparador fecha nacimiento");
        for (Socio socio: socios) {
            System.out.println(socio);
        }

        System.out.println("\nAo reverso:");
        socios.sort(comparador.reversed());
        for (Socio socio: socios ){
            System.out.println(socio);
        }

        System.out.println("------------");



    }

}
