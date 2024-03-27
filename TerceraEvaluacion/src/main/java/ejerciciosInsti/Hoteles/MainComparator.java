package ejerciciosInsti.Hoteles;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {
    public static void main(String[] args) {
        // aquí creamos los objetos
        Hotel hotel1 = new Hotel(1, Zona.PLAYA, 100);
        Hotel hotel2 = new Hotel(2,Zona.PLAYA, 75);
        Hotel hotel3 = new Hotel(3,Zona.MONTAÑA, 90);
        Hotel hotel4 = new Hotel(4,Zona.MONTAÑA, 85);
       //para mirar si son iguales
        System.out.println(""+hotel1.equals(hotel2));

        System.out.println("Qual é o valor dos dois? "+hotel2.compareTo(hotel1)); //else if (this.precio < h1.precio)

        System.out.println("Qual é o valor dos dois? "+hotel3.compareTo(hotel4)); //(this.precio > h1.precio)

        ArrayList<Hotel> hoteles = new ArrayList<>();
        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);

        System.out.println("PRIMERO");
        imprimirHoteles(hoteles);

        System.out.println("SEGUNDO");
        Collections.sort(hoteles);
        imprimirHoteles(hoteles);

        System.out.println("\n");
        System.out.println("COMPARATOR");
        CompararPrecio comparator = new CompararPrecio();
        hoteles.sort(comparator);

        System.out.println("Ordenado precios por orden ascendiente");
        for (Hotel hotel: hoteles){
            System.out.println(hotel);
        }

        System.out.println("\nOrdenado precios por orden descendente");
        Collections.reverse(hoteles); //hoteles.sort(compararPrecio.reversed)
        for (Hotel hotel: hoteles){
            System.out.println(hotel);
        }

        System.out.println("\nOrdenados por idHotel de menor a mayor.");
        CompararIdHotel comparar2 = new CompararIdHotel();
        hoteles.sort(comparar2);
        for (Hotel hotel: hoteles){
            System.out.println(hotel);
        }

        System.out.println("Al revés");
        Collections.reverse(hoteles);
        for (Hotel hotel : hoteles){
            System.out.println(hotel);
        }






       // System.out.println("TERCERO");

    }
    public static void imprimirHoteles (ArrayList<Hotel> h){
        for (Hotel hotel: h){
            System.out.println(hotel);
        }
    }
}
