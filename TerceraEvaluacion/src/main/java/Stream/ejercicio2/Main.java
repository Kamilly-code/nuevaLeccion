package Stream.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf",Integer.MAX_VALUE,Arma.bastón,false));
        personajes.add(new Personaje("Aragorn",88, Arma.espada,true));
        personajes.add(new Personaje("Gimli",140,  Arma.hacha,false));
        personajes.add(new Personaje("Legolas",2931, Arma.arco,false));
        personajes.add(new Personaje("Boromir",41, Arma.espada,true));
        personajes.add(new Personaje("Frodo",51,   Arma.anillo,false));
        personajes.add(new Personaje("Sam",33,     Arma.espada,false));

        System.out.println("1.Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.");
        personajes.stream().filter(personaje -> personaje.getEdad() < 90 && personaje.getArma() == Arma.espada ).forEach(personaje -> System.out.println(personaje + " "));

        System.out.println("\n\n2.Filtrar los personajes que no usan espada.");
        personajes.stream().filter(personaje -> personaje.getArma() != Arma.espada).forEach(personaje -> System.out.println(personaje + " "));

        System.out.println("\n\n3.Muestra los personajes ordenados por orden alfabético.");
        personajes.stream()
                .sorted(Comparator.comparing(personaje -> personaje.getNombre()))
                .forEach(personaje -> System.out.println(personaje + " "));

        System.out.println("\n\n4.Muestra los personajes humanos.");
        personajes.stream()
                        .filter(personaje -> personaje.isEsHumano(true)).forEach(personaje -> System.out.println(personaje + " "));

        System.out.println("\n\n5.Muestra el personaje más viejo.");
        personajes.stream()
                .max(Comparator.comparing(personaje -> personaje.getEdad())).stream().sorted().forEach(personaje -> System.out.println(personaje + " "));





    }
}
