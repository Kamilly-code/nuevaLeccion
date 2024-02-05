package PrimeraEvaluacion.For;

import java.util.Scanner;

/*
* 27.	Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo: el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
* */
public class Ejercicio27 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int factorizar = teclado.nextInt();

        int producto = 1;
        for (int i = factorizar; i >= 1 ; i--) {
            producto = producto * i;
            System.out.print(i);
            if (i != 1) {
                System.out.print(" * ");
            } else {
                System.out.print(" = ");
            }

        } System.out.print(producto);



    }
}
