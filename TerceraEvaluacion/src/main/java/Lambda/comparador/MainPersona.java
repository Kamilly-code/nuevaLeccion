package Lambda.comparador;

import ClasesObject.biblioteca.Socio;
import CompararPersona.CompararAltura;
import CompararPersona.CompararEdad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPersona {
    public static void main(String[] args) {
        Persona pessoa1 = new Persona("Mario",22,1.87);
        Persona pessoa2 = new Persona("Pepe",52,1.55);
        Persona pessoa3 = new Persona("Manuel",27,1.58);
        Persona pessoa4 = new Persona("David",25,1.64);
        Persona pessoa5 = new Persona("Alberto",80,1.74);

        ArrayList<Persona> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        System.out.println("UNO");
        imprimir(pessoas);

        Comparator comparator = (o1, o2) -> {
            Persona p1 = (Persona) o1;
            Persona p2 = (Persona) o2;

            if (p1.getEdad() < p2.getEdad()){
                return -1;
            } else if (p1.getEdad() > p2.getEdad()) {
                return 1;
            } else {
                return 0;
            }
        };
        /*
        * O SI NO PODÍA HABER PUESTO pessoas.sot = (o1,o2) -> { Persona p1 = (Persona) o1;
            Persona p2 = (Persona) o2;

            if (p1.getEdad() < p2.getEdad()){
                return -1;
            } else if (p1.getEdad() > p2.getEdad()) {
                return 1;
            } else {
                return 0;
            }
        };
        *
        * */
        System.out.println("DOS");
        pessoas.sort(comparator);
        imprimir(pessoas);

    }
    public static void imprimir(ArrayList<Persona> pessoas){
        for (Persona pessoa: pessoas){
            System.out.println(pessoa);
        }
    }
}
