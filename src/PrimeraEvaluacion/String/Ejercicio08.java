package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        // tengo que extraer las iniciales
        // la primera va siempre:
        //String iniciales = nombre.charAt(0); // esto no me vale porque necesito String
        String iniciales = nombre.substring(0, 1);
        //System.out.println(iniciales);
        // a esta inicial vamos añadiendo las demás
        // vamos recorriendo carácter a carácter el nombre completo; cuando encontremos un " ", sabemos que lo siguiente es una inicial
        for (int i = 0; i < nombre.length() - 1; i++) { // pongo nombre.length() - 1 porque si no el i+1 que tengo en el substring me lo desbordaría
            if (nombre.substring(i, (i + 1)).equals(" ")) { // si el carácter que estoy mirando es un espacio
                // tengo que añadir el siguiente carácter a iniciales
                iniciales = iniciales + nombre.charAt(i + 1);
            }
        }
        System.out.println(iniciales.toUpperCase());
    }
}
