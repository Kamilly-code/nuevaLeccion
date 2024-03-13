package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena:"); //
        String cadena1 = teclado.nextLine();
        System.out.print("Introduce otra cadena:"); //
        String cadena2 = teclado.nextLine();

        // idea: la frase normal     y      lafra senor mal  -> serían iguales, porque si quitamos los espacios son lafrasenormal
        // truco: quitar los espacios en ambas, y después compararlas -> reemplazando cada espacio con ""
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena1.equals(cadena2));
    }
}
