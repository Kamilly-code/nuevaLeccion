package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena:"); //
        String cadena = teclado.nextLine();
        // el truco aquí está en pasar toda la cadena a mayúsculas con toUpperCase() [también podemos pasar todo a minúsculas con toLowerCase]
        String mayúsculas = cadena.toUpperCase();
        //System.out.println(mayúsculas);
        boolean empiezaPorJ = mayúsculas.startsWith("J");
        if (empiezaPorJ) {
            System.out.println("Sí, \"" + cadena + "\" empieza por 'J'");
        } else {
            System.out.println("No.");
        }
    }
}
