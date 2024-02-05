package PrimeraEvaluacion.If;

////1.Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.

import java.util.Scanner;

public class IfConFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba aquí un número entero positivo");
        int numero = teclado.nextInt();

        boolean esPrimo = true;
        if (numero == 0 || numero == 1) {
            System.out.println("No hace parte de la tabla de los números primos.");
        } else {
            // si no es ni 0 ni 1 testar los otros números para que miremos si es primo o no:
            for (int i = 2; i < numero ; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }

            }
        }
        if (numero == 0 || numero == 1) { // Tenemos que poner aquói si no el número entra en el bucle

        } else if (esPrimo) { //ElseIf o If, tanto faz, funciona do mesmo jeito
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}
