package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto:"); // hoy es jueves y ayer fue fiesta
        String cadena = teclado.nextLine();

        // reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’. -> método replace(old, new)
        cadena = cadena.replace('a', 'b'); // sustituimos el valor que teníamos por el nuevo, con los caracteres reeemplazados
        System.out.println(cadena);
    }
}
