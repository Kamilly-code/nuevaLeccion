package PrimeraEvaluacion.If;
//8.	Escribe un programa que lea un año e indique si es bisiesto. Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto que también sea divisible por  400.

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int año = teclado.nextInt();
        //Divisible por 4=
        // variable %(modulo del resto de la división)4 == 0

        if ((año%4 == 0 && año%100 != 0)||año%400 == 0) {
            System.out.println("El año es biciesto");
        } else {
            System.out.println("El año no es biciesto");
        }
    }
}
