package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();

        // para verla carácter a carácter -> charAt(indice)
        for (int i = 0; i < cadena.length(); i++) { // tamaño: cadena.length() pero la última posición es
            System.out.println(cadena.charAt(i));
        }
    }
}
