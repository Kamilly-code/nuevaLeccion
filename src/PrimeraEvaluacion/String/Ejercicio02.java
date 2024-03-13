package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto:"); // hoy es jueves y ayer fue fiesta
        String cadena = teclado.nextLine();
        System.out.print("Ahora introduce el texto que quieres comprobar si está: "); // jueves -> true   Jueves -> false
        String texto = teclado.nextLine();

        // el método que me sirve para comprobar si una cadena contiene otra es contains()
        if (cadena.contains(texto)) {
            System.out.println("Sí, el texto \"" + texto + "\" está dentro de \"" + cadena + "\"");
        } // si no está, no decimos nada
    }
}
