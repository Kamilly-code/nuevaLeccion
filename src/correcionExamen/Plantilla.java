package correcionExamen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plantilla {
    static Scanner teclado = new Scanner(System.in);
    HashMap<Integer, Jugador> plantilla;

    public Plantilla() {
        this.plantilla = new HashMap<>();
    }

    public void altaJugador(Integer dorsal) {
        // sólo introducimos al jugador en la plantilla si no existe ese dorsal
        if (!plantilla.containsKey(dorsal)) {

            System.out.print("DNI: ");
            String dni = teclado.nextLine();

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Posición:\n1. Portero\n2. Defensa\n3.- Centrocampista\n4.- Delantero");
            String p = teclado.nextLine().substring(0, 1); // esto también podría haber sido un int
            Posicion posicion = null;
            switch (p) {
                case "1":
                    posicion = Posicion.PORTERO;
                    break;
                case "2":
                    posicion = Posicion.DEFENSA;
                    break;
                case "3":
                    posicion = Posicion.CENTROCAMPISTA;
                    break;
                case "4":
                    posicion = Posicion.DELANTERO;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

            System.out.println("Estatura: ");
            double estatura = teclado.nextDouble();teclado.nextLine();

            Jugador jugador = new Jugador(dni, nombre, posicion, estatura);

            plantilla.put(dorsal, jugador);
        }
    }

    public Jugador eliminarJugador(Integer dorsal) {
        if (plantilla.containsKey(dorsal)) {
            Jugador jugador = plantilla.get(dorsal);
            plantilla.remove(dorsal);
            return jugador;
        }else {
            return null;
        }
    }

    public void mostrar(Posicion posicion) {
        for (Map.Entry<Integer,Jugador> entrada: plantilla.entrySet()) {
            Posicion p = entrada.getValue().getPosicion();
            if (posicion.equals(p)) {
                System.out.println(entrada.getValue());
            }
        }
    }


    public boolean editarJugador(Integer dorsal) {
        if (plantilla.containsKey(dorsal)) {

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Posición:\n1. Portero\n2. Defensa\n3.- Centrocampista\n4.- Delantero");
            String p = teclado.nextLine().substring(0, 1); // esto también podría haber sido un int
            Posicion posicion = null;
            switch (p) {
                case "1":
                    posicion = Posicion.PORTERO;
                    break;
                case "2":
                    posicion = Posicion.DEFENSA;
                    break;
                case "3":
                    posicion = Posicion.CENTROCAMPISTA;
                    break;
                case "4":
                    posicion = Posicion.DELANTERO;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

            System.out.println("Estatura: ");
            double estatura = teclado.nextDouble();

            Jugador jugador = new Jugador(plantilla.get(dorsal).getDni(), nombre, posicion, estatura);

            plantilla.put(dorsal, jugador);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plantilla{" +
                "plantilla=" + plantilla +
                '}';
    }
}
