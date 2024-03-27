package solamente.teste7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Plantilla plantilla = new Plantilla();
        System.out.println("Creamos cinco jugadores");
        System.out.println("==========================");
        plantilla.altaJugador(1);
        plantilla.altaJugador(2);
        plantilla.altaJugador(3);
        plantilla.altaJugador(4);
        plantilla.altaJugador(5);

        System.out.println("\nMostramos los que juegan de delanteros");
        System.out.println("=============================");
        plantilla.mostrar(Posicion.Defensa);

        System.out.println("\nEleiminamos el jugador con el dorsal 1 y mostramos la plantilla");
        System.out.println("=================================");
        plantilla.eliminarJugador(1);

        System.out.println(plantilla);

        System.out.println("\nEditamos el jugador con dorsal 4 y mostramos la plantilla");
        System.out.println("=====================================");
        plantilla.eliminarJugador(4);

        System.out.println(plantilla);

    }
}
