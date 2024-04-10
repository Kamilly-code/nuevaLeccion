package Lambda.comparador;

import CompararPersona.Persona;

import java.util.Comparator;

public interface Ejercicio1 extends Comparator {
    public default int compare(Object o1, Object o2) {
        CompararPersona.Persona p1 = (CompararPersona.Persona) o1;
        CompararPersona.Persona p2 = (Persona) o2;
        if (p1.getEdad() < p2.getEdad()) {
            return -1;
        } else if (p1.getEdad() > p2.getEdad()) {
            return 1;
        } else {
            return 0;
        }
    }
}
