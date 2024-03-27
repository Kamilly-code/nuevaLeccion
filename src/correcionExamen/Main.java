package correcionExamen;

public class Main {
    public static void main(String[] args) {
        Plantilla plantilla = new Plantilla();
        System.out.println("Creamos cinco jugadores");
        System.out.println("=======================");
        plantilla.altaJugador(1); // portero
        plantilla.altaJugador(2); // defensa
        plantilla.altaJugador(3); // defensa
        plantilla.altaJugador(4); // centrocampista
        plantilla.altaJugador(5); // delantero


        System.out.println("\nMostramos los que juegan de delanteros");
        System.out.println("======================================");
        plantilla.mostrar(Posicion.DEFENSA);

        System.out.println("\nEliminamos el jugador con dorsal 1 y mostramos la plantilla");
        System.out.println("==========================================================");
        plantilla.eliminarJugador(1);

        System.out.println(plantilla);

        System.out.println("\nEditamos el jugador con dorsal 4 y mostramos la plantilla");
        System.out.println("=========================================================");
        plantilla.editarJugador(4);

        System.out.println(plantilla);
    }
}
