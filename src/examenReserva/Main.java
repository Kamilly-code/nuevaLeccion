package examenReserva;

public class Main {
    public static void main(String[] args) {
        Plantilla mapa = new Plantilla();
        System.out.println("Criamos cinco jogadores: ");
        System.out.println("=================================");
        mapa.altaJugador(1); //portero
        mapa.altaJugador(2); //defensa
        /*mapa.altaJugador(3); //defensa
        mapa.altaJugador(4); //centrocampista
        mapa.altaJugador(5); //delantero*/

        System.out.println("\nMostramos los que juegan de delanteros");
        System.out.println("======================================");
        mapa.mostrar(Posicion.delantero);


    }
}
