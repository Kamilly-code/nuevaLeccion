package examenReserva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plantilla {
    //ATRIBUTO
    static Scanner teclado = new Scanner(System.in);
    HashMap<Integer,Jugador> mapa;


    //Métodos

    public Plantilla() {
        this.mapa = new HashMap<>(); //instanciar no constructor ?
    }

    public void altaJugador(Integer dorsal){
       //QUE ACRESCENTA UMA ENTRADA AO MAPA COM O NUMERO DA CAMISA COMO PARAMETRO, *E O JOGADOR CRIADO DENTRO DO METODO* INTRODUCINDO TODOS OS DADOS POR TECLADO.

        if (!mapa.containsKey(dorsal)){
            System.out.println("Escreve o seu DNI: ");
            String dni = teclado.nextLine();
            System.out.println("EScreve seu nome: ");
            String nombre = teclado.nextLine();
            System.out.println("Escreve a sua posicion: \n1.Portero.\n2.Defensa.\n3.Centrocampista.\n4.Delantero");
            int p = teclado.nextInt();
            Posicion posicion = null;
            switch (p) {
                case 1:
                    posicion = Posicion.portero;
                    break;
                case 2:
                    posicion = Posicion.defensa;
                    break;
                case 3:
                    posicion = Posicion.centrocampista;
                    break;
                case 4:
                    posicion = Posicion.delantero;
                    break;
                default:
                    System.out.println("Lo siento, pero esa position no está en nuestra lista. Dejanos su sugerencias.");
            }
            System.out.println("Estatura: ");
            double estatura = teclado.nextDouble();teclado.nextLine();

            Jugador jogador1 = new Jugador(dni,nombre,posicion,estatura);

            mapa.put(dorsal,jogador1);
        }
    }
    public Jugador eliminarJugador (Integer dorsal){
        if (mapa.containsKey(dorsal)){
            Jugador jogador1 = mapa.get(dorsal);
            mapa.remove(dorsal);
            return jogador1;
        }else {
            return null;
        }
    }
    public void mostrar (Posicion posicion){
        //En este ejemplo, usamos el ciclo foreach para iterar sobre el mapa. Al usar el ciclo for-each, obtenemos un entrySet() que proporciona una "vista" automatizada de los datos en el mapa, en forma de pares clave-valor. Cada conjunto de entradas contiene una clave y los valores correspondientes. Donde puede usar todos los métodos de Map.Entry<key, value> según sus requisitos. Aquí, solo hemos usado getKey() y getValue() para mostrar los datos en la consola. Como ejercicio, puedes explorar el resto de los métodos para fortalecer tu dominio sobre este concepto.

        /*for (String key : bookMap.keySet()) {
    System.out.println("key: " + key + " value: " + bookMap.get(key));
}*/
        for (Map.Entry<Integer,Jugador> lista: mapa.entrySet() ){
            System.out.println("Llave: " +lista.getKey()+ "Value:" +lista.getValue());
            Posicion p = lista.getValue().getPosicion();
            if (posicion == p) {
                System.out.println(lista.getValue());
            }
        }
    }
    public boolean editarJugador (Integer dorsal){
        if (mapa.containsKey(dorsal)){
            System.out.println("Nombre:");
            String nombre = teclado.nextLine();
            System.out.println("DNI:");
            String dni = teclado.nextLine();
            System.out.println("Posicion: \n1.Portero\n2.Defensa\n3.Centrocampista\n4.Delantero");
           int p = teclado.nextInt();
           Posicion posicion = null;
            switch (p){
                case 1:
                    posicion = Posicion.portero;
                    break;
                case 2:
                    posicion = Posicion.defensa;
                    break;
                case 3:
                    posicion = Posicion.centrocampista;
                    break;
                case 4:
                    posicion = Posicion.delantero;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("Estatura:");
            double estatura = teclado.nextDouble();teclado.nextLine();
            Jugador jogador = new Jugador(mapa.get(dorsal).getDni(), nombre,posicion,estatura);
            mapa.put(dorsal,jogador);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plantilla{" +
                "mapa=" + mapa +
                '}';
    }
}
