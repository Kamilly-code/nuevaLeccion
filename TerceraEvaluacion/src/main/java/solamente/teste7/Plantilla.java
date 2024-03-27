package solamente.teste7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Plantilla {
    static Scanner teclado = new Scanner(System.in);
   HashMap<Integer, Jugador> mapa;

    public Plantilla() {
        this.mapa = new HashMap<>();
    }

    public void altaJugador (Integer dorsal){
        if (!mapa.containsKey(dorsal)) {
            String nombre;
            System.out.println("Escriba el dni del jugador: ");
            String dni = teclado.nextLine();
            System.out.println("Escriba el nombre del jugador: ");
            nombre = teclado.nextLine();
            System.out.println("Elija las posiciones del jugador.\n1.Portero.\n2.Defensa\n3.Centrocampista\n4.Delantero");
            int opcion = teclado.nextInt();
            Posicion posicion1 = null;
            switch (opcion) {
                case 1:
                    posicion1 = Posicion.Portero;
                    break;
                case 2:
                    posicion1 = Posicion.Defensa;
                    break;
                case 3:
                    posicion1 = Posicion.Centrocampista;
                    break;
                case 4:
                    posicion1 = Posicion.Delantero;
                    break;
                default:
                    System.out.println("Posicion inexistente");
            }
            System.out.println("Elija la estatura de tu jugador: ");
            double estatura = teclado.nextDouble();

            Jugador exemplo = new Jugador(dni, nombre, posicion1, estatura);
            mapa.put(dorsal, exemplo);
        }

    }

    public Jugador eliminarJugador (Integer dorsal){

        if (mapa.containsKey(dorsal)){
            Jugador exemplo = mapa.get(dorsal);
            mapa.remove(dorsal);
            return exemplo;

        } else {
            return null;
        }
    }

    public void mostrar (Posicion posicion){
        for (Map.Entry<Integer,Jugador> jogadores : mapa.entrySet()){
           Posicion p = jogadores.getValue().getPosicion();
           if (posicion.equals(p)){
               System.out.println(jogadores.getValue());
           }
        }
    }

    public boolean editarJugador (Integer dorsal){
        String nombre;
        double estatura;
        Posicion posicion1;
        if (mapa.containsKey(dorsal)) {
            System.out.println("Cambie el nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Cambie la posicion: ");
            System.out.println("Elija las posiciones del jugador.\n1.Portero.\n2.Defensa\n3.Centrocampista\n4.Delantero");
            int opcion = teclado.nextInt();
            posicion1 = null;
            switch (opcion) {
                case 1:
                    posicion1 = Posicion.Portero;
                    break;
                case 2:
                    posicion1 = Posicion.Defensa;
                    break;
                case 3:
                    posicion1 = Posicion.Centrocampista;
                    break;
                case 4:
                    posicion1 = Posicion.Delantero;
                    break;
                default:
                    System.out.println("Posicion inexistente");
            }
            System.out.println("Cambie la estatura: ");
            estatura = teclado.nextDouble();
            Jugador editado = new Jugador(mapa.get(dorsal).getDni(),nombre,posicion1,estatura);
            mapa.put(dorsal,editado);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plantilla{" +
                "mapa=" + mapa +
                '}';
    }
}
