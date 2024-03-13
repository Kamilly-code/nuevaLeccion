package PrimeraEvaluacion.String;

import java.util.Scanner;

public class Ejercicio15OtraForma {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        // Con char
        System.out.println("introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println("Introduce un carácter: ");
        char caracter =  teclado.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println(contador);


    }
}
