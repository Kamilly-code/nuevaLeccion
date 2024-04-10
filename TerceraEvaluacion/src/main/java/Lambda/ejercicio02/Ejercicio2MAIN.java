package Lambda.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2MAIN {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Felipe R", 54,new String[]{"Nauseas", "Mareos"});
        Paciente paciente2 = new Paciente("Irene M", 32,new String[]{"Tos", "Cansancio", "Mareos"});
        Paciente paciente3 = new Paciente("Carmen C", 15,new String[]{"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago A", 8,new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel A", 60,new String[]{"Tos", "Amnesia", "Fiebre", "Dolor"});

        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        System.out.println("Según están en la lista.");
        System.out.println(pacientes);

        System.out.println("\n Ordenar por nombre: ");
        pacientes.sort((p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println(pacientes);
        System.out.println("\nOrdenados por nombre (descendente): ");
        pacientes.sort((p1,p2)-> p2.getNombre().compareTo(p1.getNombre()));
        System.out.println(pacientes);
        System.out.println("\nOrdenar por edad");
        pacientes.sort((p1,p2)-> p1.getEdad()- p2.getEdad());
        System.out.println(pacientes);
        System.out.println("\nPor numero de sintomas");
        pacientes.sort((p1,p2)-> p2.getSíntomas().length - p1.getSíntomas().length);
        System.out.println(pacientes);

       // pacientes.sort((p1-p2)-> );

    }
}
