package PrimeraEvaluacion.While;

import java.util.Scanner;

/*
* 37.	Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
*/
public class Ejercicio37While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char vocales = teclado.nextLine().charAt(0);
        while (vocales!=' ') {
            if ((Character.toLowerCase(vocales) == 'a' || Character.toLowerCase(vocales) == 'e' ||
                    Character.toLowerCase(vocales) == 'i' || Character.toLowerCase(vocales) == 'o' ||
                    Character.toLowerCase(vocales) == 'u')) {
                    System.out.println("VOCAL");

            } else {
                System.out.println("NO VOCAL");

            }
            vocales = teclado.nextLine().charAt(0); // ficar pedindo números

        }
    }
}
